package com.example.webshopchicnchoc.controller;

import com.example.webshopchicnchoc.entity.Product;
import com.example.webshopchicnchoc.service.ProductService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins="http://localhost:3000")
@RequestMapping("api/")
@RestController
public class ProductController {

    @Autowired
    private ProductService service;


    @PostMapping("/post")
    public Product addProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    //Get user
    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    //Get users
    @GetMapping("/product/{id}")
    public Product findProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product) {
        return service.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }
}