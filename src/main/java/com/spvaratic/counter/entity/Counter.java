package com.spvaratic.counter.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Counter {
    @Id
    @GeneratedValue
    private Long id;
    private int idClient;
    private int apaCurent;
    private int salubrizareCurent;
    @Column(nullable = false,
            columnDefinition="TIMESTAMP default CURRENT_TIMESTAMP")
    private java.sql.Timestamp addedOn;
}
