package com.spvaratic.counter.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ServiceType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;
    private String title;
    private float price;
}
