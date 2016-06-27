package com.shadowbring.loan.config;

import com.shadowbring.loan.domain.LoanRecord;
import com.shadowbring.loan.domain.LoanIssuer;
import com.shadowbring.loan.repository.LoanRecordRepository;
import com.shadowbring.loan.repository.LoanIssuerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.math.BigDecimal;
import java.util.Arrays;

@Configuration
@Slf4j
public class AppConfig {

    @Autowired
    private LoanRecordRepository loanRecordRepository;

    @Autowired
    private LoanIssuerRepository loanIssuerRepository;

    @Bean
    @Profile({"dev", "default"})
    public CommandLineRunner commandLineRunner() {
        return (args) -> {
            LoanIssuer dmytro = new LoanIssuer();
            LoanIssuer marina = new LoanIssuer();
            LoanRecord loanRecord = new LoanRecord();
            LoanRecord loanRecord2 = new LoanRecord();
            dmytro.setFirstName("Dmytro");
            dmytro.setLastName("Bezruk");
            marina.setFirstName("Marina");
            marina.setLastName("Bezruk");
            loanIssuerRepository.save(Arrays.asList(dmytro, marina));
            loanRecord.setClientIp("127.0.0.1");
            loanRecord.setLoanAmount(BigDecimal.valueOf(100500.99));
            loanRecord.setTerm(10);
            loanRecord.setLoanIssuer(dmytro);
            loanRecord2.setClientIp("127.0.0.1");
            loanRecord2.setLoanAmount(BigDecimal.valueOf(100500100.69));
            loanRecord2.setTerm(100);
            loanRecord2.setLoanIssuer(marina);
            loanRecordRepository.save(Arrays.asList(loanRecord, loanRecord2));
            log.info("Users pushed: [{}]", loanIssuerRepository.findAll().size());
            log.info("Loan Records pushed: [{}]", loanRecordRepository.findAll().size());
        };
    }
}
