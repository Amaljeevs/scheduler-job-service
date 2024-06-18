//package com.alfaris.schedulerservice.thread;
//
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.alfaris.schedulerservice.service.DistributedLockServiceUsingJPA;
//
//public class LockAcquisitionTest {
//	
//	@Autowired
//	private DistributedLockServiceUsingJPA lockService;
//
//	public static void main(String[] args) {
//		int numThreads = 100;
//		ExecutorService executor = Executors.newFixedThreadPool(numThreads);
//
//		for (int i = 0; i < numThreads; i++) {
//			executor.execute(new LockAcquisitionTask());
//		}
//
//		executor.shutdown();
//	}
//
//	public static class LockAcquisitionTask implements Runnable {
//		@Override
//		public void run() {
//			String lockKey = "jobLock";
//			String instanceId = "uniqueInstanceId";
//			lockService.acquireLock(lockKey, instanceId);
//			System.out.println(Thread.currentThread().getName() + " is attempting to acquire the lock.");
//		}
//	}
//}
