package com.alfaris.schedulerservice.job;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.alfaris.schedulerservice.entity.PshSchedulerTest;
import com.alfaris.schedulerservice.repository.PshSchedulerTestRepository;

@Component
public class NormalSchedulerJob {

	private static Logger logger = LogManager.getLogger(NormalSchedulerJob.class);

	@Autowired
	private PshSchedulerTestRepository repository;

	@Scheduled(fixedDelay = 3000)
	public void doJob() {
		System.out.println("Executing Normal Scheduler Job...");
		PshSchedulerTest recordToProcess = repository.findByStatus("reverse");
		if (recordToProcess != null) {
			logger.info("Found record to process: " + recordToProcess);
			recordToProcess.setStatus("processed");
			repository.save(recordToProcess);
		} else {
			System.out.println("No record found with status 'reverse'");
		}
	}
}
