package com.alfaris.schedulerservice.service;

import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.concurrent.TimeUnit;

@Service
public class DistributedLockService {

	@Autowired
	private RedissonClient redissonClient;

	public boolean acquireLock(String lockKey) {
		RLock lock = redissonClient.getLock(lockKey);
		try {
			return lock.tryLock(10, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			return false;
		}
	}

	public void releaseLock(String lockKey) {
		RLock lock = redissonClient.getLock(lockKey);
		if (lock.isHeldByCurrentThread()) {
			lock.unlock();
		}
	}
}
