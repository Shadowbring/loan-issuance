package com.shadowbring.loan.repository;

import com.shadowbring.loan.domain.LoanIssuer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface LoanIssuerRepository extends JpaRepository<LoanIssuer, Long> {
}
