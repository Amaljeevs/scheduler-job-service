package com.alfaris.schedulerservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "LOCK_TABLE", schema = "IPSH")
public class DistributedLock {

    @Id
    private String lockKey;
    private String instanceId;
    private Instant timestamp;

    public DistributedLock() {
    }

    public DistributedLock(String lockKey, String instanceId, Instant timestamp) {
        this.lockKey = lockKey;
        this.instanceId = instanceId;
        this.timestamp = timestamp;
    }

    public String getLockKey() {
        return lockKey;
    }

    public void setLockKey(String lockKey) {
        this.lockKey = lockKey;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }
}
