package com.example.demo.Restaurant_Admin.Menu_Edit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Restaurant_Admin.Menu_Edit.Repository.DcMenu_Repository;
import com.example.demo.database.DcMenu;


@Service
public class DcMenu_Service {

	@Autowired
	private DcMenu_Repository menu_Repository;
	public List<DcMenu> getAllMenuItems() {
        return menu_Repository.findAll();
    }

    
    public DcMenu getMenuItemById(Long id) {
        return menu_Repository.findById(id).orElse(null);
    }

  
    public void saveMenuItem(DcMenu menuItem) {
    	menu_Repository.save(menuItem);
    }


    public void deleteMenuItem(Long id) {
    	menu_Repository.deleteById(id);
    }
}
