package com.example.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Cart;
import com.example.demo.Model.User;


public interface CartRepository extends JpaRepository<Cart,Integer> {
	 Optional<Cart> findByUser(User user);

}
