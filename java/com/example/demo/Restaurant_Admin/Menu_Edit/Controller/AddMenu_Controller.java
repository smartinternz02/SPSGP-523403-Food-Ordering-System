package com.example.demo.Restaurant_Admin.Menu_Edit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Restaurant_Admin.Service.AddMenu_Service;
import com.example.demo.Storage.AddMenu;


@Controller
@RequestMapping("/restaurants_restaurantadmin/addItem/dc")
public class AddMenu_Controller {

	@Autowired
	private AddMenu_Service Service;
	
	@GetMapping
	public String show()
	{
		
		return "dcaddmenuitem";
	}
	
	@PostMapping
	public String processSignUpForm(AddMenu add, Model model) {
		
			
			Service.addData(add);
			// Redirect to the login page after successful sign-up
			System.out.println("Data Saved");
			return "redirect:/restaurants_restaurantadmin/dc"; 
		 
	}
}
