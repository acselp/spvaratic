package com.spvaratic.counter.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;
    private String fname;
    private String lname;
    private int nrCont;
    private int nrContor;
    private int nrCopii;
}
