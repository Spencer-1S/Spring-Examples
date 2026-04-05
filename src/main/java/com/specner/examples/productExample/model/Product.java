package com.specner.examples.productExample.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
public class Product {
    private int productId;
    private String productName;
    private String price;

    public Product(int productId, String productName, String price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }
}
