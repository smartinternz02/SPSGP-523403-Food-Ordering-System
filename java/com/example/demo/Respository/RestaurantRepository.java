package com.example.demo.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.database.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long>{

}
