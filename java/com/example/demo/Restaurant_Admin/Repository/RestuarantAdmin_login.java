package com.example.demo.Restaurant_Admin.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Restaurant_Admin.databases.RestaurantAdmin_Login;


public interface RestuarantAdmin_login extends JpaRepository<RestaurantAdmin_Login, Long> 
{
	//Optional<RestaurantAdmin_Login> findByUsername(String username);

	RestaurantAdmin_Login findByusernameAndPassword(String username, String password);

}
