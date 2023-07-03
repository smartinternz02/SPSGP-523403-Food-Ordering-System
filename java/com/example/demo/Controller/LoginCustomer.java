package com.example.demo.Controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Service.LoginService;
import com.example.demo.database.SignUpCustomer;

@Controller
@RequestMapping("/Login")
public class LoginCustomer {

	@Autowired
	private LoginService userService;
	@GetMapping    
	public ModelAndView login()
	{
		ModelAndView mav = new ModelAndView("Login");
		mav.addObject("user", new SignUpCustomer());
		return mav;
	}
	@PostMapping
	public String login(@ModelAttribute("user") SignUpCustomer user ) {

		SignUpCustomer oauthUser = userService.login(user.getUsername(), user.getPassword());

		System.out.print(oauthUser);
		System.out.println("fuckk");
		if(Objects.nonNull(oauthUser)) 
		{    

			return "redirect:/restaurants";


		} else {
			return "redirect:/";
		}
	}

}
