package com.example.demo.Respository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.database.QuickBitesMenu;

public interface QuickBitesRepository extends CrudRepository<QuickBitesMenu, Long> {

}
