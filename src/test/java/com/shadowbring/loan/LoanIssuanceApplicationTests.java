package com.shadowbring.loan;

import com.shadowbring.loan.repository.LoanRecordRepository;

import com.shadowbring.loan.repository.LoanIssuerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = LoanIssuanceApplication.class)
public class LoanIssuanceApplicationTests {

	@Autowired
	private LoanRecordRepository loanRecordRepository;

	@Autowired
	private LoanIssuerRepository loanIssuerRepository;

	@Test
	public void contextLoads() {
		assertEquals("Expected 2 (int value)", loanRecordRepository.findAll().size(), 2);
		assertEquals("Expected 2 (int value)", loanIssuerRepository.findAll().size(), 2);
	}
}
