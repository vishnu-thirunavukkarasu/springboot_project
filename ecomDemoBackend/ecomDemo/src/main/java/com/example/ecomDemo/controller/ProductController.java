package com.example.ecomDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecomDemo.model.Product;
import com.example.ecomDemo.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {

	
	@RequestMapping("/")
	public String greet() {
		return "Hello Vishnu";
	}
	
	@Autowired// field injection used here for basic coding
	public ProductService service;
	
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return service.getAllProducts();
	}
}
