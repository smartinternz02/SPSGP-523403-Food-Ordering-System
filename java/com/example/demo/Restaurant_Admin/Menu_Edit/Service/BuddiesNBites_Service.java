package com.example.demo.Restaurant_Admin.Menu_Edit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Restaurant_Admin.Menu_Edit.Repository.BuddiesNBites_Repository;
import com.example.demo.database.BuddiesNBitesMenu;
@Service
public class BuddiesNBites_Service {

	
	@Autowired
	private BuddiesNBites_Repository menu_Repository;
	public List<BuddiesNBitesMenu> getAllMenuItems() {
        return menu_Repository.findAll();
    }

    
    public BuddiesNBitesMenu getMenuItemById(Long id) {
        return menu_Repository.findById(id).orElse(null);
    }

  
    public void saveMenuItem(BuddiesNBitesMenu menuItem) {
    	menu_Repository.save(menuItem);
    }


    public void deleteMenuItem(Long id) {
    	menu_Repository.deleteById(id);
    }
}
