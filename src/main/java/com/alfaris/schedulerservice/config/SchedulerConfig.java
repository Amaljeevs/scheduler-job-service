package com.alfaris.schedulerservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SchedulerConfig {

    @Value("${cron.expression}")
    private String cronExpression;

    @Bean
    public String cronExpression() {
        return cronExpression;
    }
}

