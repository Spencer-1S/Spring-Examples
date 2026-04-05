package com.specner.examples.productExample.repository;

import com.specner.examples.productExample.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "Laptop", "$999"));
        products.add(new Product(2, "Smartphone", "$499"));
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public void saveProduct(Product product) {
        products.add(product);
    }

    public Product getProductById(int productId) {
        return products.stream().filter(p -> p.getProductId() == productId).findFirst().orElse(null);
    }

}
