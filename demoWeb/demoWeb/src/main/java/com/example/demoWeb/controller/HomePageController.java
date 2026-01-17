package com.example.demoWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //tomention if it is a restcontroller it returns the data in the response body
public class HomePageController {

	@RequestMapping("/") // for mapping endpoints we do this 
	public String greet() {
		 return "Welcome to homepage";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "spring web rocks...";
	}
}
