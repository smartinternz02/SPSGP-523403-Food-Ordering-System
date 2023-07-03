package com.example.demo.Restaurant_Admin.Menu_Edit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Restaurant_Admin.Menu_Edit.Service.BuddiesNBites_Service;
import com.example.demo.database.BuddiesNBitesMenu;

@Controller
public class BuddiesNBitesMenu_Controller {

	@Autowired
	private  BuddiesNBites_Service menuService;
	
	 // Update Menu Item
    @GetMapping("/restaurants_restaurantadmin/updateMenu/BuddiesNBitesMenu")
    public String updateMenuItem(@RequestParam("id") Long id, Model model) {
    	 BuddiesNBitesMenu menuItem = menuService.getMenuItemById(id);
        model.addAttribute("menuItem", menuItem);
        return "BuddiesNBitesMenu-update-menu-form";
    }

    @PostMapping("/restaurants_restaurantadmin/saveUpdatedMenu/BuddiesNBitesMenu")
    public String saveMenuItem(@ModelAttribute("menuItem")  BuddiesNBitesMenu menuItem) {
        menuService.saveMenuItem(menuItem);
        return "redirect:/restaurants_restaurantadmin/BuddiesNBitesMenu";
    }

    // Delete Menu Item
    @GetMapping("/restaurants_restaurantadmin/deleteMenu/BuddiesNBitesMenu")
    public String deleteMenuItem(@RequestParam("id") Long id) {
        menuService.deleteMenuItem(id);
        return "redirect:/restaurants_restaurantadmin/BuddiesNBitesMenu";
    }
}
