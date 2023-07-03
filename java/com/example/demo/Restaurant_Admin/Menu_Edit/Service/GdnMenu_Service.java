package com.example.demo.Restaurant_Admin.Menu_Edit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Restaurant_Admin.Menu_Edit.Repository.GdnMenu_Repository;
import com.example.demo.database.GdnMenu;

@Service
public class GdnMenu_Service {

	@Autowired
	private GdnMenu_Repository menu_Repository;
	public List<GdnMenu> getAllMenuItems() {
        return menu_Repository.findAll();
    }

    
    public GdnMenu getMenuItemById(Long id) {
        return menu_Repository.findById(id).orElse(null);
    }

  
    public void saveMenuItem(GdnMenu menuItem) {
    	menu_Repository.save(menuItem);
    }


    public void deleteMenuItem(Long id) {
    	menu_Repository.deleteById(id);
    }
}
