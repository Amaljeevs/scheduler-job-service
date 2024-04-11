////package com.alfaris.pshquartsschedulerservice.job;
////
////import org.quartz.Job;
////import org.quartz.JobExecutionContext;
////import org.quartz.JobExecutionException;
////import org.springframework.beans.factory.annotation.Autowired;
////import org.apache.logging.log4j.LogManager;
////import org.apache.logging.log4j.Logger;
////import com.alfaris.pshquartsschedulerservice.entity.PshSchedulerTest;
////import com.alfaris.pshquartsschedulerservice.repository.PshSchedulerTestRepository;
//////Quartz Scheduler
////public class SchedulerJob implements Job {
////	
////	private static Logger logger = LogManager.getLogger(SchedulerJob.class);
////
////	@Autowired
////	private PshSchedulerTestRepository repository;
////
////	@Override
////	public void execute(JobExecutionContext context) throws JobExecutionException {
////		System.out.println("Executing Quartz Job...");
////		PshSchedulerTest recordToProcess = repository.findByStatus("retry");
////		if (recordToProcess != null) {
////			logger.info("Found record to process: " + recordToProcess);
////			System.out.println("Found record to process: " + recordToProcess);
////			recordToProcess.setStatus("processed");
////			repository.save(recordToProcess);
////		} else {
////			System.out.println("No record found with status 'retry'");
////		}
////	}
////}
//package com;
//
