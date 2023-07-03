package com.example.demo.Restaurant_Admin.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/restaurants_restaurantadmin")
public class Restaurant_RestaurantAdmin {
	
	@GetMapping
	public String show() {
		return "Restaurant_RestaurantAdmin";
	}

}
