package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Respository.AdminLoginRepository;
import com.example.demo.database.Admin;


@Service
public class AdminLoginService {
	
	@Autowired
	private AdminLoginRepository adminLoginRepository;
	
	public Admin login(String username, String password) {
		 Admin user = adminLoginRepository.findByusernameAndPassword(username, password);
	      return user;
	  }

}
