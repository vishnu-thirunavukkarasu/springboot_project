package com.example.ecomDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecomDemo.model.Product;
import com.example.ecomDemo.repo.ProductRepo;



@Service
public class ProductService {
	
	@Autowired
	private ProductRepo repo;

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		
		
		return repo.findAll();
	}

}
