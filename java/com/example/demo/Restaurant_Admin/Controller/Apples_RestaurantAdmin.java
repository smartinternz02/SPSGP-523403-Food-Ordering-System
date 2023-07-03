package com.example.demo.Restaurant_Admin.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Respository.AppleRepository;
import com.example.demo.Storage.MenuWithTableName;
import com.example.demo.database.ApplesMenu;



@Controller
@RequestMapping("/restaurants_restaurantadmin/apples")
public class Apples_RestaurantAdmin {

	@Autowired
	private AppleRepository MenuRepository;
	
	
	@GetMapping
    public String getMenuItems(Model model) {
		Iterable<ApplesMenu> menuItems = MenuRepository.findAll();
		List<MenuWithTableName> menuItemsWithTableNames = new ArrayList<>();
		for (ApplesMenu menuItem : menuItems) {
	        MenuWithTableName menuWithTableName = new MenuWithTableName(menuItem.getId(),menuItem.getItem_name(),menuItem.getItem_image(),menuItem.getPrice(), "ApplesMenu");
	        menuItemsWithTableNames.add(menuWithTableName);
	    }
	    model.addAttribute("menuItems", menuItemsWithTableNames);
        
        return "RestaurantMenu_RestaurantAdmin";
    }
}
