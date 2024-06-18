package com.alfaris.schedulerservice.service;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Optional;
import java.util.concurrent.locks.ReentrantLock;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alfaris.schedulerservice.cache.LRUCache;
import com.alfaris.schedulerservice.entity.DistributedLock;
import com.alfaris.schedulerservice.repository.DistributedLockRepository;

@Service
public class DistributedLockServiceUsingJPA {

	private static final long LOCK_EXPIRY_DURATION_SECONDS = 30;
	private static final int CACHE_CAPACITY = 100;

	@Autowired
	private DistributedLockRepository lockRepository;

	private LRUCache<String, Boolean> lockCache;
	private final ReentrantLock cacheLock = new ReentrantLock();

	@PostConstruct
	public void init() {
		lockCache = new LRUCache<>(CACHE_CAPACITY);
		startCacheRefresher();
	}

	@Transactional
	public boolean acquireLock(String lockKey, String instanceId) {
		boolean lockAcquired = false;

		cacheLock.lock();
		try {
			Boolean cachedLockStatus = lockCache.get(lockKey);
			if (cachedLockStatus != null && cachedLockStatus) {
				return false; // Lock is already acquired which is taken from cache.
			}
		} finally {
			cacheLock.unlock();
		}

		try {
			Optional<DistributedLock> existingLockOpt = lockRepository.findById(lockKey);

			if (!existingLockOpt.isPresent() || isLockExpired(existingLockOpt.get())) {
				DistributedLock lock = new DistributedLock(lockKey, instanceId, Instant.now());
				lockRepository.save(lock);
				lockAcquired = true;

				cacheLock.lock();
				try {
					lockCache.put(lockKey, true);
				} finally {
					cacheLock.unlock();
				}
			}
		} catch (Exception e) {
			System.out.println("Failed to attain Lock!!");
			lockAcquired = false;
		}

		return lockAcquired;
	}

	@Transactional
	public void releaseLock(String lockKey, String instanceId) {
		Optional<DistributedLock> existingLockOpt = lockRepository.findById(lockKey);

		if (existingLockOpt.isPresent()) {
			DistributedLock existingLock = existingLockOpt.get();
			if (existingLock.getInstanceId().equals(instanceId)) {
				lockRepository.deleteById(lockKey);

				cacheLock.lock();
				try {
					lockCache.put(lockKey, false);
				} finally {
					cacheLock.unlock();
				}
			}
		}
	}

	private boolean isLockExpired(DistributedLock lock) {
		Instant now = Instant.now();
		Instant lockTime = lock.getTimestamp();
		return lockTime.plus(LOCK_EXPIRY_DURATION_SECONDS, ChronoUnit.SECONDS).isBefore(now);
	}

	private void startCacheRefresher() {
		Thread refresherThread = new Thread(() -> {
			while (true) {
				try {
					Thread.sleep(5000); // Refresh every 5 seconds
					refreshCache();
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
					break;
				}
			}
		});
		refresherThread.setDaemon(true);
		refresherThread.start();
	}

	private void refreshCache() {
		try {
			Iterable<DistributedLock> locks = lockRepository.findAll();
			cacheLock.lock();
			try {
				lockCache.clear();
				for (DistributedLock lock : locks) {
					if (!isLockExpired(lock)) {
						lockCache.put(lock.getLockKey(), true);
					}
				}
			} finally {
				cacheLock.unlock();
			}
		} catch (Exception e) {
			System.out.println("Failed to refresh cache!!");
		}
	}
}
