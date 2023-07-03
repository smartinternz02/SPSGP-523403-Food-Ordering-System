package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.demo.Respository.QuickBitesRepository;
import com.example.demo.database.QuickBitesMenu;


@Controller
@RequestMapping("/restaurants/QuickBites")
public class QuickBites_Controller 
{
	@Autowired
	private QuickBitesRepository MenuRepository;
	
	
	@GetMapping
    public String getMenuItems(Model model) {
		Iterable<QuickBitesMenu> menuItems = MenuRepository.findAll();
       // System.out.println("sfdfsdfdsf");
        model.addAttribute("menuItems", menuItems);
        return "FC";
    }
}
