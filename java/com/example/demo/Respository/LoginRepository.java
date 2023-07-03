package com.example.demo.Respository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.database.SignUpCustomer;

public interface LoginRepository extends JpaRepository<SignUpCustomer, Long>
{


	Optional<SignUpCustomer> findByUsername(String username);

	SignUpCustomer findByusernameAndPassword(String username, String password);



}
