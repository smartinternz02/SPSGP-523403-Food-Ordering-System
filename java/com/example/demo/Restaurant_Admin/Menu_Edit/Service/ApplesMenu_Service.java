package com.example.demo.Restaurant_Admin.Menu_Edit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Restaurant_Admin.Menu_Edit.Repository.ApplesMenu_Repository;
import com.example.demo.database.ApplesMenu;

@Service
public class ApplesMenu_Service {

	@Autowired
	private ApplesMenu_Repository menu_Repository;
	
	public List<ApplesMenu> getAllMenuItems() {
        return menu_Repository.findAll();
    }

    
    public ApplesMenu getMenuItemById(Long id) {
        return menu_Repository.findById(id).orElse(null);
    }

  
    public void saveMenuItem(ApplesMenu menuItem) {
    	menu_Repository.save(menuItem);
    }


    public void deleteMenuItem(Long id) {
    	menu_Repository.deleteById(id);
    }
	
}
