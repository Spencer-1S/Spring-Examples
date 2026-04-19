package com.specner.examples.Units.springDataJPA.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Specification {
    @Id
    private int id;
    private String processor;
    private String gpu;
    private String ram;
    private String storage;
    private String batteryCapacity;

}
