package com.example.demo.Respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.database.FcMenu;

public interface FcMenuRepository extends CrudRepository<FcMenu, Long>{

	

	

}
