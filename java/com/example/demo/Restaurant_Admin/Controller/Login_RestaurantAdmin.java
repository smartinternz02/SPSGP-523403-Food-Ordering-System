package com.example.demo.Restaurant_Admin.Controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Restaurant_Admin.Service.LoginAdmin_Service;
import com.example.demo.Restaurant_Admin.databases.RestaurantAdmin_Login;


@Controller
@RequestMapping("/restaurantadminLogin")
public class Login_RestaurantAdmin {

	
	@Autowired
	private LoginAdmin_Service userService;
	
	@GetMapping    
	public ModelAndView login()
	{
		ModelAndView mav = new ModelAndView("Login_RestaurantAdmin");
		mav.addObject("user", new RestaurantAdmin_Login() );
		return mav;
	}
	@PostMapping
	public String login(@ModelAttribute("user") RestaurantAdmin_Login user ) {

		RestaurantAdmin_Login oauthUser = userService.login(user.getUsername(), user.getPassword());

		System.out.print(oauthUser);
		if(Objects.nonNull(oauthUser)) 
		{    

			return "redirect:/restaurants_restaurantadmin";


		} else {
			return "redirect:/";
		}
	}
}
