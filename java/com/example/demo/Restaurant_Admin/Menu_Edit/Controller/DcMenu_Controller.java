package com.example.demo.Restaurant_Admin.Menu_Edit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Restaurant_Admin.Menu_Edit.Service.DcMenu_Service;
import com.example.demo.database.DcMenu;

@Controller
public class DcMenu_Controller {

	@Autowired
	private DcMenu_Service menuService;
	
	 // Update Menu Item
    @GetMapping("/restaurants_restaurantadmin/updateMenu/DcMenu")
    public String updateMenuItem(@RequestParam("id") Long id, Model model) {
    	DcMenu menuItem = menuService.getMenuItemById(id);
        model.addAttribute("menuItem", menuItem);
        System.out.println("asdfas");
        return "update-menu-form";
    }

    @PostMapping("/restaurants_restaurantadmin/saveUpdatedMenu/DcMenu")
    public String saveMenuItem(@ModelAttribute("menuItem") DcMenu menuItem) {
    	System.out.println("asdasfasdfasdas");
        menuService.saveMenuItem(menuItem);
        return "redirect:/restaurants_restaurantadmin/dc";
    }

    // Delete Menu Item
    @GetMapping("/restaurants_restaurantadmin/deleteMenu/DcMenu")
    public String deleteMenuItem(@RequestParam("id") Long id) {
        menuService.deleteMenuItem(id);
        return "redirect:/restaurants_restaurantadmin/dc";
    }
}
