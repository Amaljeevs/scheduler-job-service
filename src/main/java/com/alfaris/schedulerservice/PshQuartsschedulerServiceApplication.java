package com.alfaris.schedulerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PshQuartsschedulerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PshQuartsschedulerServiceApplication.class, args);
	}

}
