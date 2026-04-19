package com.specner.examples.Units.productExample.service;


import com.specner.examples.Units.productExample.model.Product;
import com.specner.examples.Units.productExample.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

    public Product getProductById(int id) {
        return productRepository.getProductById(id);
    }

    public void addProduct(Product product) {
        productRepository.saveProduct(product);
    }

    public void updateProduct(Product product) {
        productRepository.updateProduct(product);
    }

    public void deleteProduct(int id) {
        productRepository.deleteProductById(id);
    }
}
