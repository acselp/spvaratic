package com.spvaratic.counter.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id;
    private String fname;
    private String lname;
    private Integer nrCont;
    private Integer nrContor;
    private Integer nrPersoane;
}
