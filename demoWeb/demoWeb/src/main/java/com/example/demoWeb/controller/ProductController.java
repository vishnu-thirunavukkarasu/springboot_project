package com.example.demoWeb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoWeb.model.Product;
import com.example.demoWeb.service.ProductService;

@RestController
public class ProductController {
    
	@Autowired
	ProductService service;
	

	
	
	@RequestMapping("/products")
	public List<Product> getProducts() {
		return service.getProducts();
	}
      
	/*
	 * here i create a method in service class, once it receives to match any id we use 
	 * path variable to match with int input
	 * */
	@RequestMapping("/products/{prodId}")// so in here i need to find for prod id
	public Product getProductById(@PathVariable int prodId) {
		return service.getProductById(prodId);
	}
	
	
	@PostMapping("/products")
	public void addProduct(@RequestBody Product prod) {
		service.addProduct(prod);
	}
	
	}

