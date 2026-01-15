package com.example.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//this annotation is used to tell spring to get the object for this class and hence we use component here to specify that i need an object of this class
@Component
public class dev {

	@Autowired // field injection where i tell spring that i need instance of laptop class inside dev class 
	private Laptop laptop;
	
	/* I can use interface instead of the class 
	 * 
	 * eg
	 * @Autowired
	 * private Computer laptop;
	 * this will also work instead of using class here we can use interface
	 * 
	 * incase of two classes having same methods in interface  1. we can use @primary 
	 * 2. we can use @Qualifier with class name in without caps
	 * 
	 * eg 
	 * @Autowired
	 * @Qualifier("laptop")
	 * private Computer comp;
	 * 
	 */
	
	/* 
	 * we can also use Constructor injection no need of autowired in this
	 * 
	 * public dev(Laptop laptop){
	 * 
	 * this.laptop=laptop;
	 * } this also works instead of field injection
	 * 
	 * or Setter injection
	 * still we need the autowired for setter
	 * 
	 * @Autowired
	 * public void setLaptop(Laptop laptop){
	 * 
	 * this.laptop=laptop;
	 * }  this also works 
	 * 
	 */
	
	public void  build() {
		
		System.out.println("working on a new proj");
		laptop.compile();
	}
}
