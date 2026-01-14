package com.example.demo.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity

public class Client {

    @Id
    Long id;

    String name;

    @OneToMany
    List<Order> orders;
}
