package com.example.demo.Service;

import com.example.demo.payload.CartDto;
import com.example.demo.payload.ItemRequest;

//import com.ecom.Model.Cart;
//import com.ecom.payload.CartDto;
//import com.ecom.payload.CartItemDto;
//import com.ecom.payload.ItemRequest;

public interface CartService {
	
	CartDto addItem(ItemRequest item,String UserName);
	CartDto getCart(String UserName);
	CartDto  removeCartItem(String UserName,int productId);

}
