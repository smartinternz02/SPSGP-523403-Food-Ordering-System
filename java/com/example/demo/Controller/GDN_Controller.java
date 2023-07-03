package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Respository.GdnRepository;
import com.example.demo.database.GdnMenu;



@Controller
@RequestMapping("/restaurants/gdn")
public class GDN_Controller 
{
	@Autowired
	private GdnRepository MenuRepository;
	
	
	@GetMapping
    public String getMenuItems(Model model) {
		Iterable<GdnMenu> menuItems = MenuRepository.findAll();
       // System.out.println("sfdfsdfdsf");
        model.addAttribute("menuItems", menuItems);
        return "FC";
    }
}
