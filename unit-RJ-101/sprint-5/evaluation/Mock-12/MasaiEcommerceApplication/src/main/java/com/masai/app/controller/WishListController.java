package com.masai.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.model.Product;
import com.masai.app.model.WishList;
import com.masai.app.service.WishListService;

import jakarta.validation.Valid;

@RestController
public class WishListController {

	
	@Autowired
	private WishListService wishListService;
	
	
	
	
	
	
	
	@PostMapping("/masaiEcommerce/wishlist/add")
	public ResponseEntity<WishList> addProductToWishListHandler(@Valid @RequestBody Product product){
		
		WishList wishList = wishListService.addProductToWishList(product);
		
		return new ResponseEntity<>(wishList, HttpStatus.OK);
	}
	
	
	
	@DeleteMapping("/masaiEcommerce/wishlist/remove/{wishListId}/{productId}")
	public ResponseEntity<WishList> addProductToWishListHandler(@PathVariable("wishListId") Integer wishListId, @PathVariable("productId") Integer productId){
		
		WishList wishList = wishListService.removeProductFromWishList(productId, wishListId);
		
		return new ResponseEntity<>(wishList, HttpStatus.OK);
	}
	
}
