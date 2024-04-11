//package com.alfaris.schedulerservice.config;
////
////import org.quartz.*;
////import org.springframework.context.annotation.Bean;
////import org.springframework.context.annotation.Configuration;
////
////import com.alfaris.pshquartsschedulerservice.job.SchedulerJob;
////
////@Configuration
////public class QuartzConfig {
////
////	@Bean
////	public JobDetail myJobDetail() {
////		return JobBuilder.newJob(SchedulerJob.class).withIdentity("SchedulerJob").storeDurably().build();
////	}
////
////	@Bean
////	public Trigger myTrigger() {
////		SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(3000)
////				.repeatForever();
////
////		return TriggerBuilder.newTrigger().forJob(myJobDetail()).withIdentity("myTrigger").withSchedule(scheduleBuilder)
////				.build();
////	}
////}
//package com;
//
//
