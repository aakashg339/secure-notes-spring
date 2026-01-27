package com.secure.notes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.secure.notes.models.AuditLog;

@Repository
public interface AuditLogRepository extends JpaRepository<AuditLog, Long> {



}
