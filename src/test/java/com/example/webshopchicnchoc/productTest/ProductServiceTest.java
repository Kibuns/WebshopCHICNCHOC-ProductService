package com.example.webshopchicnchoc.productTest;

import com.example.webshopchicnchoc.entity.Product;
import com.example.webshopchicnchoc.repository.ProductRepository;
import com.example.webshopchicnchoc.service.ProductService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

import static org.mockito.Mockito.verify;

@DataJpaTest
public class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;
    private AutoCloseable autoCloseable;
    private ProductService underTest;

    //before every test
    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
        underTest = new ProductService(productRepository);
    }

    //after every test
    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    @Test
    void saveProduct() {

        Product prod = new Product();
        //when
        underTest.saveProduct(prod);
        //then
        verify(productRepository).save(prod);
    }

    @Test
    void getProducts() {
        //when
        underTest.getProducts();
        //then
        verify(productRepository).findAll();
    }

    @Test
    void getProductById() {
        //when
        underTest.getProductById(1);
        //then
        verify(productRepository).findById(1);
    }

    @Test
    void deleteProduct() {
        //when
        underTest.deleteProduct(1);
        //then
        verify(productRepository).deleteById(1);
    }
}