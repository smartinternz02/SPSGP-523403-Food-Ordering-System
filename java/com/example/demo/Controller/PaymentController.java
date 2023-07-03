package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/restaurants/fc/payment")
public class PaymentController 
{
   @GetMapping
   public String showPayment()
   {
	   return "payment";
   }
	
}
