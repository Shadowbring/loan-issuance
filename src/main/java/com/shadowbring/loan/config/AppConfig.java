package com.shadowbring.loan.config;

import com.shadowbring.loan.domain.LoanRecord;
import com.shadowbring.loan.repository.LoanRecordRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.math.BigDecimal;

import lombok.extern.slf4j.Slf4j;

@Configuration
@EnableAutoConfiguration
@Slf4j
public class AppConfig {

    @Autowired
    private LoanRecordRepository repository;

    @Bean
    @Profile({"dev", "default"})
    public CommandLineRunner commandLineRunner() {
        return (args) -> {
            LoanRecord loanRecord = new LoanRecord();
            loanRecord.setClientFirstName("Dmytro");
            loanRecord.setClientLastName("Bezruk");
            loanRecord.setClientIp("127.0.0.1");
            loanRecord.setLoanAmount(BigDecimal.valueOf(100500.99));
            repository.save(loanRecord);
            LoanRecord loanRecord2 = new LoanRecord();
            loanRecord2.setClientFirstName("Marina");
            loanRecord2.setClientLastName("Bezruk");
            loanRecord2.setClientIp("127.0.0.1");
            loanRecord2.setLoanAmount(BigDecimal.valueOf(100500100.69));
            repository.save(loanRecord2);
            log.info("Entities pushed: [{}]", repository.findAll().size());
        };
    }
}
