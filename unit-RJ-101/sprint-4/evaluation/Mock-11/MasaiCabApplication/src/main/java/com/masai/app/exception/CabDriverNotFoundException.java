package com.masai.app.exception;

public class CabDriverNotFoundException extends RuntimeException {

	public CabDriverNotFoundException() {
		
	}
	
	public CabDriverNotFoundException(String message) {
		super(message);
	}
	
}
