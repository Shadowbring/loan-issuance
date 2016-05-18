package com.shadowbring.loan.repository;

import com.shadowbring.loan.domain.LoanRecord;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface LoanRecordRepository extends JpaRepository<LoanRecord, Long> {
}
