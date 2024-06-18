package com.alfaris.schedulerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alfaris.schedulerservice.entity.DistributedLock;

public interface DistributedLockRepository extends JpaRepository<DistributedLock, String> {
}

