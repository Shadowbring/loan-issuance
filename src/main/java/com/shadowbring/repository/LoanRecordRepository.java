package com.shadowbring.repository;

import com.shadowbring.domain.LoanRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRecordRepository extends JpaRepository<LoanRecord, Long>{
}
