package com.example.myApp;

import org.springframework.stereotype.Component;

@Component // to tell spring i need object of this class
public class Laptop implements Computer {

	
	
	public void compile() {
		
		System.out.println("compiling with error");  
	}
}
