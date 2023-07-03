package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/restaurants/payment/message")
public class MessagaController {

	
	@GetMapping
	public String showmessageAfterPaymet() {
		return "message";
	}
}
