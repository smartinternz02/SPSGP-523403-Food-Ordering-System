package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.demo.Respository.AdminRestaurantsRepository;
import com.example.demo.database.AdminRestaurant;


@Controller
@RequestMapping("/admindashboard/restaurants")
public class AdminSideRestaurants_Controller {

	@Autowired
    private AdminRestaurantsRepository adminRestaurantsRepository;
 
 @GetMapping
 public String getrestaurants(Model model) {
	Iterable<AdminRestaurant> menuItems = adminRestaurantsRepository.findAll();
    // System.out.println("sfdfsdfdsf");
     model.addAttribute("menuItems", menuItems);
     return "adminSideRestaurants";
 }
}
