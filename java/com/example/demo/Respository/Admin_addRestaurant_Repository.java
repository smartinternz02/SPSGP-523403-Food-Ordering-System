package com.example.demo.Respository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.Storage.AddRestaurant;
import com.example.demo.database.AdminRestaurant;

public interface Admin_addRestaurant_Repository extends JpaRepository<AdminRestaurant, Long> {
    Optional<AdminRestaurant> findByname(String name);
}

