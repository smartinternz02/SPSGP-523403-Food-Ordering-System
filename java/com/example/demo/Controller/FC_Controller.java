package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Respository.FcMenuRepository;
import com.example.demo.database.FcMenu;

@Controller
@RequestMapping("/restaurants/fc")
public class FC_Controller 
{
	@Autowired
	private FcMenuRepository fcMenuRepository;
	
	
	@GetMapping
    public String getMenuItems(Model model) {
		Iterable<FcMenu> menuItems = fcMenuRepository.findAll();
        System.out.println("sfdfsdfdsf");
        model.addAttribute("menuItems", menuItems);
        return "FC";
    }
}
