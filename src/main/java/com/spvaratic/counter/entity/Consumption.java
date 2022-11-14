package com.spvaratic.counter.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Consumption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;

    private int idClient;
    private int idServiceType;
    private float paid;
    @Column(nullable = false,
            columnDefinition="TIMESTAMP default CURRENT_TIMESTAMP")
    private java.sql.Timestamp paidOn;
}
