package com.example.demo.Restaurant_Admin.Menu_Edit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Restaurant_Admin.Menu_Edit.Service.FcMenu_Service;
import com.example.demo.database.FcMenu;

@Controller
public class FcMenu_Controller {
  
	@Autowired
	private FcMenu_Service menuService;
	
	 // Update Menu Item
    @GetMapping("/restaurants_restaurantadmin/updateMenu/FcMenu")
    public String updateMenuItem(@RequestParam("id") Long id, Model model) {
    	FcMenu menuItem = menuService.getMenuItemById(id);
        model.addAttribute("menuItem", menuItem);
        return "Fc-update-menu-form";
    }

    @PostMapping("/restaurants_restaurantadmin/saveUpdatedMenu/FcMenu")
    public String saveMenuItem(@ModelAttribute("menuItem") FcMenu menuItem) {
        menuService.saveMenuItem(menuItem);
        return "redirect:/restaurants_restaurantadmin/fc";
    }

    // Delete Menu Item
    @GetMapping("/restaurants_restaurantadmin/deleteMenu/FcMenu")
    public String deleteMenuItem(@RequestParam("id") Long id) {
        menuService.deleteMenuItem(id);
        return "redirect:/restaurants_restaurantadmin/fc";
    }
}
