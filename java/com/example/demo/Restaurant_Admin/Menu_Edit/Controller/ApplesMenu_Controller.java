package com.example.demo.Restaurant_Admin.Menu_Edit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Restaurant_Admin.Menu_Edit.Service.ApplesMenu_Service;
import com.example.demo.database.ApplesMenu;


@Controller
public class ApplesMenu_Controller {

	@Autowired
	private ApplesMenu_Service menuService;
	
	 // Update Menu Item
    @GetMapping("/restaurants_restaurantadmin/updateMenu/ApplesMenu")
    public String updateMenuItem(@RequestParam("id") Long id, Model model) {
    	ApplesMenu menuItem = menuService.getMenuItemById(id);
        model.addAttribute("menuItem", menuItem);
        return "Apples-update-menu-form";
    }

    @PostMapping("/restaurants_restaurantadmin/saveUpdatedMenu/ApplesMenu")
    public String saveMenuItem(@ModelAttribute("menuItem") ApplesMenu menuItem) {
        menuService.saveMenuItem(menuItem);
        return "redirect:/restaurants_restaurantadmin";
    }

    // Delete Menu Item
    @GetMapping("/restaurants_restaurantadmin/deleteMenu/ApplesMenu")
    public String deleteMenuItem(@RequestParam("id") Long id) {
        menuService.deleteMenuItem(id);
        return "redirect:/restaurants_restaurantadmin";
    }
}
