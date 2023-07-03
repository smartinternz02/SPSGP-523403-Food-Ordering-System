package com.example.demo.Restaurant_Admin.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Respository.DcMenuRepository;
import com.example.demo.Storage.MenuWithTableName;
import com.example.demo.database.DcMenu;


@Controller
@RequestMapping("/restaurants_restaurantadmin/dc")
public class Dc_RestaurantAdmin {

	@Autowired
	private DcMenuRepository MenuRepository;
	
	
	@GetMapping
    public String getMenuItems(Model model) {
		Iterable<DcMenu> menuItems = MenuRepository.findAll();
		List<MenuWithTableName> menuItemsWithTableNames = new ArrayList<>();
		for (DcMenu menuItem : menuItems) {
	        MenuWithTableName menuWithTableName = new MenuWithTableName(menuItem.getId(),menuItem.getItem_name(),menuItem.getItem_image(),menuItem.getPrice(), "DcMenu");
	        menuItemsWithTableNames.add(menuWithTableName);
	    }
	    model.addAttribute("menuItems", menuItemsWithTableNames);
        return "RestaurantMenu_RestaurantAdmin";
    }
}
