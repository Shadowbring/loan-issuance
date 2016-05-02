package com.shadowbring.loan.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Data
public class LoanRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String clientFirstName;

    @NotNull
    private String clientLastName;

    @NotNull
    private String clientIp;

    @NotNull
    private BigDecimal loanAmount;

    @NotNull
    private long term;
}
