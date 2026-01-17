package com.example.demoWeb.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demoWeb.model.Product;


@Service
public class ProductService {

	List<Product> products =new ArrayList<>( Arrays.asList(
			new Product(100, "Samsung" , 75000),
			new Product(101, "Iphone" , 80000)
			));
	
	public List<Product> getProducts(){
		return products;
	}
	
	
	//This method is created to fetch the id and it can be done using for loop or stream api , we used stream api here
	public Product getProductById(int prodId) {
		return products.stream().filter(p -> p.getProdId() == prodId).findFirst().get();
	}
	
	public void addProduct(Product prod) {
		products.add(prod);
	}


	public void updateProduct(Product prod) {
		// TODO Auto-generated method stub
		int index=0;
		for(int i=0; i<products.size(); i++)
			if(products.get(i).getProdId() == prod.getProdId())
				index = i;
		products.set(index, prod);
	}


	public void deleteProductById(int prodId) {
		// TODO Auto-generated method stub
		int index=0;
		for(int i=0; i<products.size(); i++)
			if(products.get(i).getProdId() == prodId)
				index = i;
		
		products.remove(index);
	}



       
	
	
	
	
	
}
