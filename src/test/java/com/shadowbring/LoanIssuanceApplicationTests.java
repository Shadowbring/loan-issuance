package com.shadowbring;

import com.shadowbring.repository.LoanRecordRepository;
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
    private LoanRecordRepository repository;

    @Test
    public void contextLoads() {
        assertEquals(repository.findAll().size(), 2);
    }

}
