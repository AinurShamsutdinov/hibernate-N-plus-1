package com.example.demo.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Order {
    @Id
    Long id;

    @OneToMany
    List<Item> items;
}
