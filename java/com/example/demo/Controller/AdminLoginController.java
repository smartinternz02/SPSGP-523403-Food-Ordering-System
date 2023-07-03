package com.example.demo.Controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Service.AdminLoginService;
import com.example.demo.database.Admin;


@Controller
@RequestMapping("/adminLogin")
public class AdminLoginController 
{
	@Autowired
	private AdminLoginService  userService;
	
	@GetMapping    
	public ModelAndView login()
	{
		ModelAndView mav = new ModelAndView("adminLogin");
		mav.addObject("user", new Admin());
		return mav;
	}
	@PostMapping
	public String login(@ModelAttribute("user") Admin user ) {

		Admin oauthUser = userService.login(user.getUsername(), user.getPassword());

		System.out.print(oauthUser);
		System.out.println("fuckk");
		if(Objects.nonNull(oauthUser)) 
		{    

			return "redirect:/admindashboard";


		} else {
			return "redirect:/";
		}
	}
}
