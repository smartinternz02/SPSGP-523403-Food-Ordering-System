package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Respository.AppleRepository;
import com.example.demo.database.ApplesMenu;




@Controller
@RequestMapping("/restaurants/apples")
public class Apples_Controller 
{
	@Autowired
	private AppleRepository MenuRepository;
	
	
	@GetMapping
    public String getMenuItems(Model model) {
		Iterable<ApplesMenu> menuItems = MenuRepository.findAll();
       // System.out.println("sfdfsdfdsf");
        model.addAttribute("menuItems", menuItems);
        return "FC";
    }
}
