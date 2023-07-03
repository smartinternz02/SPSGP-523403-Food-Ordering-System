package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Respository.BuddiesNBitesRepository;
import com.example.demo.database.BuddiesNBitesMenu;




@Controller
@RequestMapping("/restaurants/buddiesNBites")
public class BuddiesNBites_Controller 
{
	@Autowired
	private BuddiesNBitesRepository MenuRepository;
	
	
	@GetMapping
    public String getMenuItems(Model model) {
		Iterable<BuddiesNBitesMenu> menuItems = MenuRepository.findAll();
       // System.out.println("sfdfsdfdsf");
        model.addAttribute("menuItems", menuItems);
        return "FC";
    }
}
