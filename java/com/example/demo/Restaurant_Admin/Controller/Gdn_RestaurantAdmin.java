package com.example.demo.Restaurant_Admin.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Respository.GdnRepository;
import com.example.demo.database.GdnMenu;
import com.example.demo.Storage.MenuWithTableName;


@Controller
@RequestMapping("/restaurants_restaurantadmin/gdn")
public class Gdn_RestaurantAdmin {

	@Autowired
	private GdnRepository MenuRepository;
	
	
	@GetMapping
    public String getMenuItems(Model model) {
		Iterable<GdnMenu> menuItems = MenuRepository.findAll();
		
		List<MenuWithTableName> menuItemsWithTableNames = new ArrayList<>();
		
		for (GdnMenu menuItem : menuItems) {
	        MenuWithTableName menuWithTableName = new MenuWithTableName(menuItem.getId(),menuItem.getItem_name(),menuItem.getItem_image(),menuItem.getPrice(), "GdnMenu");
	        menuItemsWithTableNames.add(menuWithTableName);
	    }
        model.addAttribute("menuItems", menuItems);
        return "RestaurantMenu_RestaurantAdmin";
    }
}
