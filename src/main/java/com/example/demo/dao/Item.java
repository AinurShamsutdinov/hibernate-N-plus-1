package com.example.demo.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Item {

    @Id
    Long id;

    String name;
}
