package com.alfaris.schedulerservice.job;

import java.util.UUID;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.alfaris.schedulerservice.entity.PshSchedulerTest;
import com.alfaris.schedulerservice.repository.PshSchedulerTestRepository;
import com.alfaris.schedulerservice.service.DistributedLockServiceUsingJPA;

@Component
public class DistributedLockJob {

	private static Logger logger = LogManager.getLogger(DistributedLockJob.class);

	@Autowired
	private DistributedLockServiceUsingJPA lockService;

	@Autowired
	private PshSchedulerTestRepository repository;

	@Autowired
	@Qualifier("cronExpression")
	private String cronTime;

	@Scheduled(cron = "#{@cronExpression}")
	public void processJob() {
		String lockKey = "jobLock";
		String instanceId = "uniqueInstanceId";

		try {
			boolean lockAcquired = lockService.acquireLock(lockKey, instanceId);
			if (lockAcquired) {
				try {
					// Logic Here.
					System.out.println("Job executed successfully");
					PshSchedulerTest recordToProcess = repository.findByStatus("reverse");
					if (recordToProcess != null) {
						logger.info("Found record to process: " + recordToProcess);
						recordToProcess.setStatus("processed");
						repository.save(recordToProcess);
						PshSchedulerTest recordToProcess2 = new PshSchedulerTest();
						recordToProcess2.setSerialNo(UUID.randomUUID().toString());
						recordToProcess2.setPaymentReference("sample");
						recordToProcess2.setStatus("processed");
						repository.save(recordToProcess2);
					} else {
						System.out.println("No record found with status 'reverse'");
					}
				} finally {
					lockService.releaseLock(lockKey, instanceId);
				}
			} else {
				System.out.println("Failed to acquire lock, another instance is already processing");
			}
		} catch (Exception e) {
			System.out.println("Failed to acquire lock, another instance is already processing");
		}
	}
}
