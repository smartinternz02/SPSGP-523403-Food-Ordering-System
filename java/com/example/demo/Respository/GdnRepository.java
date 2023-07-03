package com.example.demo.Respository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.database.GdnMenu;

public interface GdnRepository extends CrudRepository<GdnMenu, Long> {

}
