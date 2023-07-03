package com.example.demo.Restaurant_Admin.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.demo.Respository.FcMenuRepository;
import com.example.demo.database.FcMenu;
import com.example.demo.Storage.MenuWithTableName;

@Controller
@RequestMapping("/restaurants_restaurantadmin/fc")
public class Fc_RestaurantAdmin {

	@Autowired
	private FcMenuRepository MenuRepository;
	
	
	@GetMapping
    public String getMenuItems(Model model) {
		Iterable<FcMenu> menuItems = MenuRepository.findAll();
		List<MenuWithTableName> menuItemsWithTableNames = new ArrayList<>();
		for (FcMenu menuItem : menuItems) {
	        MenuWithTableName menuWithTableName = new MenuWithTableName(menuItem.getId(),menuItem.getItem_name(),menuItem.getItem_image(),menuItem.getPrice(), "FcMenu");
	        menuItemsWithTableNames.add(menuWithTableName);
	    }
	    model.addAttribute("menuItems", menuItemsWithTableNames);
        return "RestaurantMenu_RestaurantAdmin";
 }
	

}
