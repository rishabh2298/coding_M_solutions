package com.masai.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.model.Cart;
import com.masai.app.model.Product;
import com.masai.app.service.CartService;

import jakarta.validation.Valid;

@RestController
public class CartController {

	@Autowired
	private CartService cartService;
	
	
	
	
	@PostMapping("/masaiEcommerce/cart/{cartId}")
	public ResponseEntity<Cart> addProductToCartHandler(@PathVariable("cartId") Integer cartId , @Valid @RequestBody Product product){
		
		Cart cart = cartService.addProductToCart(cartId, product);
		
		return new ResponseEntity<>(cart, HttpStatus.OK);
	}
	
	
}
