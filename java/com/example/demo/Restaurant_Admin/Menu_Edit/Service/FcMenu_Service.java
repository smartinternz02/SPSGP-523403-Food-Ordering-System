package com.example.demo.Restaurant_Admin.Menu_Edit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Restaurant_Admin.Menu_Edit.Repository.FcMenu_Repository;
import com.example.demo.database.FcMenu;


@Service
public class FcMenu_Service {

	@Autowired
	private FcMenu_Repository menu_Repository;
	public List<FcMenu> getAllMenuItems() {
        return menu_Repository.findAll();
    }

    
    public FcMenu getMenuItemById(Long id) {
        return menu_Repository.findById(id).orElse(null);
    }

  
    public void saveMenuItem(FcMenu menuItem) {
    	menu_Repository.save(menuItem);
    }


    public void deleteMenuItem(Long id) {
    	menu_Repository.deleteById(id);
    }
}
