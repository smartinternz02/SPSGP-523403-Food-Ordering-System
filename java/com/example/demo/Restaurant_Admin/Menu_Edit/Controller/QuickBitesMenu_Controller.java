package com.example.demo.Restaurant_Admin.Menu_Edit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Restaurant_Admin.Menu_Edit.Service.QuickBites_Service;
import com.example.demo.database.QuickBitesMenu;

@Controller
public class QuickBitesMenu_Controller {

	@Autowired
	private QuickBites_Service menuService;
	
	 // Update Menu Item
    @GetMapping("/restaurants_restaurantadmin/updateMenu/QuickBitesMenu")
    public String updateMenuItem(@RequestParam("id") Long id, Model model) {
    	QuickBitesMenu menuItem = menuService.getMenuItemById(id);
        model.addAttribute("menuItem", menuItem);
        return "QuickBites-update-menu-form";
    }

    @PostMapping("/restaurants_restaurantadmin/saveUpdatedMenu/QuickBitesMenu")
    public String saveMenuItem(@ModelAttribute("menuItem") QuickBitesMenu menuItem) {
        menuService.saveMenuItem(menuItem);
        return "redirect:/restaurants_restaurantadmin/QuickBitesMenu";
    }

    // Delete Menu Item
    @GetMapping("/restaurants_restaurantadmin/deleteMenu/QuickBitesMenu")
    public String deleteMenuItem(@RequestParam("id") Long id) {
        menuService.deleteMenuItem(id);
        return "redirect:/restaurants_restaurantadmin/QuickBitesMenu";
    }
}
