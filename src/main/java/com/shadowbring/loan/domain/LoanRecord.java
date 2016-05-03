package com.shadowbring.loan.domain;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
public class LoanRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String clientFirstName;

    @Column(nullable = false)
    private String clientLastName;

    @Column(nullable = false)
    private String clientIp;

    @Column(nullable = false)
    private BigDecimal loanAmount;

    @Column(nullable = false)
    private long term;
}
