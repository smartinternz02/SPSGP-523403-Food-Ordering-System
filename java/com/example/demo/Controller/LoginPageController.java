package com.example.demo.Controller;

import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.example.demo.Service.SignUpService;
import com.example.demo.Service.LoginService;
import com.example.demo.Storage.SignUpForm;

import com.example.demo.database.SignUpCustomer;


@Controller
@RequestMapping("/SignUpCustomer")
public class LoginPageController 
{
	@Autowired
	private SignUpService signUpService;

	@GetMapping
    public String showSignUpForm() {
        // Handle the GET request to show the sign-up form
        return "SignUpCustomer";
    }
	@PostMapping
	public String processSignUpForm(SignUpForm signUpForm, Model model) {
		if (signUpService.isUsernameAvailable(signUpForm.getUsername())) 
		{
			
			signUpService.saveSignUpForm(signUpForm);
			// Redirect to the login page after successful sign-up
			System.out.println("Data Saved");
			return "redirect:/Login"; 
		} else {
			model.addAttribute("error", "Username already exists");
			System.out.println("Data copy");
			// Return to the sign-up form with an error message
			return "SignUpCustomer"; 
		}
	}



}
