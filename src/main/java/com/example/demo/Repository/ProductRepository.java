package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Category;
import com.example.demo.Model.Product;


public interface ProductRepository extends JpaRepository<Product,Integer> {
	
	Page<Product> findByCategory(Category category,Pageable pageable);
	List<Product> findByProductNameContaining(String pName);
	
	

}
