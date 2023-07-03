package com.example.demo.Restaurant_Admin.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Respository.BuddiesNBitesRepository;
import com.example.demo.Storage.MenuWithTableName;
import com.example.demo.database.BuddiesNBitesMenu;



@Controller
@RequestMapping("/restaurants_restaurantadmin/buddiesNBites")
public class BuddiesNBites_RestaurantAdmin {

	@Autowired
	private BuddiesNBitesRepository MenuRepository;


	@GetMapping
	public String getMenuItems(Model model) {
		Iterable<BuddiesNBitesMenu> menuItems = MenuRepository.findAll();
		List<MenuWithTableName> menuItemsWithTableNames = new ArrayList<>();
		for( BuddiesNBitesMenu menuItem : menuItems) {
	        MenuWithTableName menuWithTableName = new MenuWithTableName(menuItem.getId(),menuItem.getItem_name(),menuItem.getItem_image(),menuItem.getPrice(), "BuddiesNBitesMenu");
	        menuItemsWithTableNames.add(menuWithTableName);
	    }

		return "RestaurantMenu_RestaurantAdmin";
	}
}
