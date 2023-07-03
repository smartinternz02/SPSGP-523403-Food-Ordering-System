package com.example.demo.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Respository.LoginRepository;
import com.example.demo.database.SignUpCustomer;






@Service
public class LoginService {
    
    @Autowired
    private LoginRepository repo;
  
  public SignUpCustomer login(String username, String password) {
	  SignUpCustomer user = repo.findByusernameAndPassword(username, password);
      return user;
  }

  
}

