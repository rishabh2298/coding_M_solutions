package com.masai.app.exception;

public class TruckNotFoundException extends RuntimeException {

	public TruckNotFoundException() {
		
	}
	
	public TruckNotFoundException(String message) {
		super(message);
	}
	
}
