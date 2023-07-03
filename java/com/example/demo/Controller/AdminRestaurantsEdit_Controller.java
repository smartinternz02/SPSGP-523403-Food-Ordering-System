package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Service.AdminEditRestaurantService;
import com.example.demo.database.AdminRestaurant;

@Controller
public class AdminRestaurantsEdit_Controller {

	@Autowired
    private AdminEditRestaurantService menuService;

    // Update Menu Item
    @GetMapping("/updateMenu")
    public String updateMenuItem(@RequestParam("id") Long id, Model model) {
       AdminRestaurant menuItem = menuService.getMenuItemById(id);
        model.addAttribute("menuItem", menuItem);
        return "update-menu";
    }

    @PostMapping("/saveMenu")
    public String saveMenuItem(@ModelAttribute("menuItem") AdminRestaurant menuItem) {
        menuService.saveMenuItem(menuItem);
        return "redirect:/admindashboard/restaurants";
    }

    // Delete Menu Item
    @GetMapping("/deleteMenu")
    public String deleteMenuItem(@RequestParam("id") Long id) {
        menuService.deleteMenuItem(id);
        return "redirect:/admindashboard/restaurants";
    }
}
