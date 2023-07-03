package com.example.demo.Controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.demo.Service.Admin_addRestaurant_Service;
import com.example.demo.Storage.AddRestaurant;



@Controller
@RequestMapping("/admin/addRestaurant")
public class AdminAddRestaurant
{
	@Autowired
	private Admin_addRestaurant_Service Service;
	@GetMapping
	public String show()
	{
		
		return "addRestaurant";
	}
	
	@PostMapping
	public String processSignUpForm(AddRestaurant add, Model model) {
		if (Service.isnameAvailable(add.getName())) 
		{
			
			Service.addData(add);
			// Redirect to the login page after successful sign-up
			System.out.println("Data Saved");
			return "redirect:/admindashboard"; 
		} else {
			model.addAttribute("error", "Restaurant Name already exists");
			System.out.println("Data copy");
			// Return to the sign-up form with an error message
			return "/admin/addRestaurant"; 
		}
	}
}
