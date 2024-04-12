package com.masai.app.exception;

public class PoliceNotFoundException extends RuntimeException {

	public PoliceNotFoundException() {
		
	}
	
	public PoliceNotFoundException(String message) {
		super(message);
	}
	
}
