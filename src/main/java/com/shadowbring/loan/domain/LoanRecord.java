package com.shadowbring.loan.domain;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@SequenceGenerator(name = "recordSequence", sequenceName = "recordSequence", allocationSize = 1)
public class LoanRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "recordSequence")
    private long id;

    @Column(nullable = false)
    private String clientIp;

    @Column(nullable = false)
    private BigDecimal loanAmount;

    @Column(nullable = false)
    private long term;

    @ManyToOne
    @JoinColumn(nullable = false)
    private LoanIssuer loanIssuer;
}
