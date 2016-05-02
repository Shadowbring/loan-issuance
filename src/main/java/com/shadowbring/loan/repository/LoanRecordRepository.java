package com.shadowbring.loan.repository;

import com.shadowbring.loan.domain.LoanRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRecordRepository extends JpaRepository<LoanRecord, Long> {
}
