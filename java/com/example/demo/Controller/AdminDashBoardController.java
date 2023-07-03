package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admindashboard")
public class AdminDashBoardController 
{

	@GetMapping
	public String showDashboard() {
		return "adminDashBoard";
	}
}
