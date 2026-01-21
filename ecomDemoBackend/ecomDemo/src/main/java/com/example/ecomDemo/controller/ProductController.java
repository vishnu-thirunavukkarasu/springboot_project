package com.example.ecomDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecomDemo.model.Product;
import com.example.ecomDemo.service.ProductService;

@RestController
@CrossOrigin // for allowing cross origin access from custom front end ports
@RequestMapping("/api")
public class ProductController {

	

	
	@Autowired// field injection used here for basic coding
	public ProductService service;
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getAllProducts(){
		System.out.println(service.getAllProducts());

		return new ResponseEntity<>(service.getAllProducts(), HttpStatus.OK);
	}
	
	@GetMapping("/product/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable int id) {
		
		Product product = service.getProductById(id);
		
		if(product !=null)
		   return new ResponseEntity<>(product, HttpStatus.OK);
		else
		   return new ResponseEntity<>(HttpStatus.NOT_FOUND); 
		
	}
}
