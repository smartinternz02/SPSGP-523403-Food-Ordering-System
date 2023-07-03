package com.example.demo.Restaurant_Admin.Menu_Edit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Restaurant_Admin.Menu_Edit.Service.GdnMenu_Service;
import com.example.demo.database.GdnMenu;

@Controller
public class GdnMenu_Controller {
	@Autowired
	private GdnMenu_Service menuService;
	
	 // Update Menu Item
    @GetMapping("/restaurants_restaurantadmin/updateMenu/GdnMenu")
    public String updateMenuItem(@RequestParam("id") Long id, Model model) {
    	GdnMenu menuItem = menuService.getMenuItemById(id);
        model.addAttribute("menuItem", menuItem);
        return "Gdn-update-menu-form";
    }

    @PostMapping("/restaurants_restaurantadmin/saveUpdatedMenu/GdnMenu")
    public String saveMenuItem(@ModelAttribute("menuItem") GdnMenu menuItem) {
        menuService.saveMenuItem(menuItem);
        return "redirect:/restaurants_restaurantadmin/GdnMenu";
    }

    // Delete Menu Item
    @GetMapping("/restaurants_restaurantadmin/deleteMenu/GdnMenu")
    public String deleteMenuItem(@RequestParam("id") Long id) {
        menuService.deleteMenuItem(id);
        return "redirect:/restaurants_restaurantadmin/GdnMenu";
    }
	
}
