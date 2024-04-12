package com.masai.app.exception;

public class WishListNotFoundException extends RuntimeException {

	public WishListNotFoundException() {
		
	}
	
	public WishListNotFoundException(String message) {
		super(message);
	}
	
}
