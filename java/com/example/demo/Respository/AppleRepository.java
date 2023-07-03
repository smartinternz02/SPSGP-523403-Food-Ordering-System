package com.example.demo.Respository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.database.ApplesMenu;

public interface AppleRepository extends CrudRepository<ApplesMenu, Long> 
{

}
