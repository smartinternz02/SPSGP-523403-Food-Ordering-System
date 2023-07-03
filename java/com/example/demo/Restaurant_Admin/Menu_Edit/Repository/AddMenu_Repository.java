package com.example.demo.Restaurant_Admin.Menu_Edit.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.database.DcMenu;

public interface AddMenu_Repository extends JpaRepository<DcMenu, Long>
{
	//Optional<DcMenu> findByitem_name(String item_name);
}
