package com.example.demo.Restaurant_Admin.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.demo.Respository.QuickBitesRepository;
import com.example.demo.Storage.MenuWithTableName;

import com.example.demo.database.QuickBitesMenu;

@Controller
@RequestMapping("/restaurants_restaurantadmin/quickBites")
public class QuickBites_RestaurantAdmin {

	@Autowired
	private QuickBitesRepository MenuRepository;
	
	
	@GetMapping
    public String getMenuItems(Model model) {
		Iterable<QuickBitesMenu> menuItems = MenuRepository.findAll();
		List<MenuWithTableName> menuItemsWithTableNames = new ArrayList<>();
		for (QuickBitesMenu menuItem : menuItems) {
	        MenuWithTableName menuWithTableName = new MenuWithTableName(menuItem.getId(),menuItem.getItem_name(),menuItem.getItem_image(),menuItem.getPrice(), "QuickBitesMenu");
	        menuItemsWithTableNames.add(menuWithTableName);
	    }
	    model.addAttribute("menuItems", menuItemsWithTableNames);
        return "RestaurantMenu_RestaurantAdmin";
    }
}
