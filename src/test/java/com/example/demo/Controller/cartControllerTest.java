package com.example.demo.Controller;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.security.Principal;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.demo.Model.Cart;
import com.example.demo.Model.CartItem;
import com.example.demo.Model.Category;
import com.example.demo.Model.Product;
import com.example.demo.Model.User;
import com.example.demo.Repository.CartRepository;
import com.example.demo.Service.CartService;
import com.example.demo.payload.CartDto;
import com.example.demo.payload.ItemRequest;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
class cartControllerTest {

	@Mock
	private Product product;
	
	@Mock
	private Category category;
	
	@Mock
	private Cart cart;
	
	@Mock
	private CartItem cit;
	
	@Mock
	private CartService cartservice;
	
	@Mock
	private CartRepository cartRepository;
	
	@InjectMocks
	private cartController cartController;
	
	@Mock
	private Principal principal;
	
	@Mock 
	private User user;
	
	@Before(value = "")
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
			

	@Test
	public void testAddItemToCart() {
		int cartId =3;
		int productId = 101;
		category.setCategoryId(1);
		category.setTitle("test");
		
		product.setCategory(category);
		product.setProductId(productId);
		product.setProductName("producttest");
		product.setProductQuantity(12);
		
		ItemRequest item = new ItemRequest();
		item.setProductId(product.getProductId());
		item.setQuantity(1);
		
		
		cit.setCart(cart);
		cit.setCartIteamId(111);
		cit.setQuantity(1);
		cit.setProduct(product);
		
		
		ItemRequest savedItem = new ItemRequest();
		savedItem.setProductId(productId);
		savedItem.setQuantity(1);

		
		Set<CartItem> item1 = new Set<CartItem>() {

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Iterator<CartItem> iterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public <T> T[] toArray(T[] a) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean add(CartItem e) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean containsAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean addAll(Collection<? extends CartItem> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean retainAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean removeAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}
		};
		item1.add(cit);
		CartDto savedCart = new CartDto();
		savedCart.setCartId(cartId);
		savedCart.setUser(user);
		savedCart.setIteam(item1);
		
		when(cartservice.addItem(item, principal.getName())).thenReturn(savedCart);
		
		ResponseEntity<CartDto> response = cartController.addItem(item, principal);
		
		
		
//		System.out.println(response);
//		System.out.println(savedCart+" saved cart vs body "+response.getBody()+" "+response.getStatusCode()+" "+response.getBody().getCartId()
//				+" hi data");
//		System.out.println(response.getBody().getIteam());
//		System.out.println(item1);
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals(savedCart, response.getBody());
		assertEquals(savedCart.getCartId(), response.getBody().getCartId());
	
	}
	
	
	@Test
	public void testRemoveItemfromCart() {
		int cartId =3;
		int productId = 101;
		
		ItemRequest item = new ItemRequest();
		item.setProductId(productId);
		item.setQuantity(1);

		
		ItemRequest savedItem = new ItemRequest();
		savedItem.setProductId(productId);
		savedItem.setQuantity(1);
		
		
		CartDto savedCart = new CartDto();
		savedCart.setCartId(cartId);
		savedCart.setUser(user);
		
		when(cartservice.removeCartItem(principal.getName(), productId)).thenReturn(savedCart);
		
		ResponseEntity<CartDto> response = cartController.removeProduct(productId, principal);
		
		
		
		System.out.println(response);
		System.out.println(savedCart+" saved cart vs body "+response.getBody()+" "+response.getStatusCode()+" "+response.getBody().getCartId());
		assertEquals(HttpStatus.ACCEPTED, response.getStatusCode());
		assertEquals(savedCart, response.getBody());
		assertEquals(savedCart.getCartId(), response.getBody().getCartId());
	
	}
	
	

}
