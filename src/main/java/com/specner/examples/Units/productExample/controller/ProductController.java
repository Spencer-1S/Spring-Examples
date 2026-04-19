package com.specner.examples.Units.productExample.controller;

import com.specner.examples.Units.productExample.model.Product;
import com.specner.examples.Units.productExample.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id){
        return productService.getProductById(id);
    }

    @PostMapping("/products")
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        // In a real application, you would save the product to a database
        // Here we just add it to the in-memory list
        productService.addProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(product);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product product) {
        productService.updateProduct(product);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
    }

}
