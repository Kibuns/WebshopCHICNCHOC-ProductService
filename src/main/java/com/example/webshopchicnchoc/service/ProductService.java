package com.example.webshopchicnchoc.service;

import com.example.webshopchicnchoc.entity.Product;
import com.example.webshopchicnchoc.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    //post user
    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    //get user
    public List<Product> getProducts() {
        return repository.findAll();
    }

    public Product getProductById(int id) {
        return repository.findById(id).orElse(null);
    }

    //delete user
    public String deleteProduct(int id) {
        repository.deleteById(id);

        return "User deleted" + id;
    }

    //update user
    public Product updateProduct(Product product) {
        Product existingProduct =repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());

        return repository.save(existingProduct);
    }
}