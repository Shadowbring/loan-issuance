package com.shadowbring.loan.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@SequenceGenerator(name = "issuerSequence", sequenceName = "issuerSequence", allocationSize = 1)
public class LoanIssuer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "issuerSequence")
    private long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;
}
