package com.masai.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.model.Cart;
import com.masai.app.service.CartService;

import jakarta.validation.Valid;

@RestController
public class CartController {

	@Autowired
	private CartService cartService;
	
	
	
	
	
	
	@PutMapping("/masaibook/user/cart/{bookId}")
	public ResponseEntity<Cart> addBookToCartHandler(@PathVariable("bookId") Integer bookId, @Valid @RequestBody Cart cart){
		
		Cart result = cartService.addBookToCart(bookId, cart);
		
		return new ResponseEntity<>(result, HttpStatus.OK);
		
	}
	
	
	
	@PutMapping("/masaibook/user/cart/purchase")
	public ResponseEntity<Cart> purchaseBook(@Valid @RequestBody Cart cart){
		
		Cart result = cartService.purchaseBook(cart);
		
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
	
	
	@PutMapping("/masaibook/cart")
	public ResponseEntity<Cart> refreshCartHandler(@Valid @RequestBody Cart cart){
		
		Cart result = cartService.refreshCartToRemoveOldBooks(cart);
		
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
	
}
