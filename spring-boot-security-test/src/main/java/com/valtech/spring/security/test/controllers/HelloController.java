package com.valtech.spring.security.test.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class HelloController {
	
	@GetMapping("/register")
	public String hello(){
		return "register";
	}
	@GetMapping("/login")
	public String login(){
		return "login";
	}
	@GetMapping("/seller")
	public String admin(){
		return "Hello seller";
	}
	
	@GetMapping("/user")
	public String user(){
		return "Hello User";
	}
	
	@GetMapping("/deliveryPerson")
	public String deliveryPerson(){
		return "Hello DeliveryPerson";
	}

}
