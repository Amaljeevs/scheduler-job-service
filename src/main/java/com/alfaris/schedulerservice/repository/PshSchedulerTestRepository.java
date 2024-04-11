package com.alfaris.schedulerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alfaris.schedulerservice.entity.PshSchedulerTest;

public interface PshSchedulerTestRepository extends JpaRepository<PshSchedulerTest, String> {

	PshSchedulerTest findByStatus(String string);
}