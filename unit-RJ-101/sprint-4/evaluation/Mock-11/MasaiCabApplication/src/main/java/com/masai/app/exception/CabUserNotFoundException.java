package com.masai.app.exception;

public class CabUserNotFoundException extends RuntimeException {

	public CabUserNotFoundException() {
		
	}
	
	public CabUserNotFoundException(String message) {
		super(message);
	}
	
}
