package com.masai.app.exception;

public class BookNotFoundException extends RuntimeException {

	public BookNotFoundException() {
		
	}
	
	public BookNotFoundException(String message) {
		super(message);
	}
	
}
