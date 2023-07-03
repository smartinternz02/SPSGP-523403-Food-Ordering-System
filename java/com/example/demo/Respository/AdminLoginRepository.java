package com.example.demo.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.database.Admin;


public interface AdminLoginRepository extends JpaRepository<Admin, Long>{
	
	Admin findByusernameAndPassword(String username, String password);

}
