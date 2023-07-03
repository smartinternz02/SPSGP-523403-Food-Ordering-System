package com.example.demo.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.database.AdminRestaurant;

public interface AdminRestaurantsEditRepository extends JpaRepository<AdminRestaurant, Long>{

}
