package com.shadowbring.config;

import com.shadowbring.domain.LoanRecord;
import com.shadowbring.repository.LoanRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
@EnableAutoConfiguration
public class AppConfig {

    @Autowired
    private LoanRecordRepository repository;

    @Bean
    public CommandLineRunner commandLineRunner() {
        return (args) -> {
            LoanRecord loanRecord = new LoanRecord();
            loanRecord.setClientFirstName("Dmytro");
            loanRecord.setClientLastName("Bezruk");
            loanRecord.setClientIp("127.0.0.1");
            loanRecord.setLoanAmount(BigDecimal.valueOf(100500));
            repository.save(loanRecord);
            LoanRecord loanRecord2 = new LoanRecord();
            loanRecord2.setClientFirstName("Marina");
            loanRecord2.setClientLastName("Bezruk");
            loanRecord2.setClientIp("127.0.0.1");
            loanRecord2.setLoanAmount(BigDecimal.valueOf(100500100));
            repository.save(loanRecord2);
        };
    }
}
