package com.example.webshopchicnchoc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")

public class Product {
    @Id
    public int id;
    public String name;
    public double price;
    public String image;
    public String type;
    public String description;
    public int stock;
}