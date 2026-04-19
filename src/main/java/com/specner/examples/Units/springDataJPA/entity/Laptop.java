package com.specner.examples.Units.springDataJPA.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Laptop {
    @Id
    private int id;
    private String company;
    private String model;
    private String price;

    @OneToOne
    @JoinColumn(name = "specification_id")
    private Specification specification;
}
