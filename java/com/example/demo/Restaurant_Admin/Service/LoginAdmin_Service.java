package com.example.demo.Restaurant_Admin.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Restaurant_Admin.Repository.RestuarantAdmin_login;
import com.example.demo.Restaurant_Admin.databases.RestaurantAdmin_Login;

@Service
public class LoginAdmin_Service {
   
	@Autowired
	private RestuarantAdmin_login repo;
	
	public RestaurantAdmin_Login login(String username, String password)
	{
		RestaurantAdmin_Login user = repo.findByusernameAndPassword(username, password);
	      return user;
	  }
	
	
	
}
