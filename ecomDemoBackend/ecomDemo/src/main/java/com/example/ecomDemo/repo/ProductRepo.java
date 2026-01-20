package com.example.ecomDemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ecomDemo.model.Product;


@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

}
