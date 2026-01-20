package com.example.ecomDemo.model;

import java.math.BigDecimal;
import java.util.Date;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // to auto populate the id for the products , it is the primary id
	private int id;
	private String name;
	private String desc;
	private String brand;
	private BigDecimal price;
	private String category;
	private Date releaseDate;
	private boolean available;
	private int quantity;
	
}
