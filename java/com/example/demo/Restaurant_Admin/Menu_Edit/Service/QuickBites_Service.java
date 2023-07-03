package com.example.demo.Restaurant_Admin.Menu_Edit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Restaurant_Admin.Menu_Edit.Repository.QuickBites_Repository;
import com.example.demo.database.QuickBitesMenu;

@Service
public class QuickBites_Service {

	@Autowired
	private QuickBites_Repository menu_Repository;
	public List<QuickBitesMenu> getAllMenuItems() {
        return menu_Repository.findAll();
    }

    
    public QuickBitesMenu getMenuItemById(Long id) {
        return menu_Repository.findById(id).orElse(null);
    }

  
    public void saveMenuItem(QuickBitesMenu menuItem) {
    	menu_Repository.save(menuItem);
    }


    public void deleteMenuItem(Long id) {
    	menu_Repository.deleteById(id);
    }
}
