package com.example.demo.Respository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.database.AdminRestaurant;

public interface AdminRestaurantsRepository extends CrudRepository<AdminRestaurant, Long>{
	

}
