package com.example.myApp;

import org.springframework.stereotype.Component;

@Component // to tell spring i need object of this class
//@primary if we have two methods same here for eg we have two methods with has a common interface in laptop and desktop then i can use primary so it takes this method first 
public class Desktop implements Computer {

	
	
	public void compile() {
		
		System.out.println("compiling with error");  
	}
}