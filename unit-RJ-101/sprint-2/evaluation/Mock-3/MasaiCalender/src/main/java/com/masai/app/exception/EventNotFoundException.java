package com.masai.app.exception;

public class EventNotFoundException extends RuntimeException {

	public EventNotFoundException() {
		
	}
	
	public EventNotFoundException(String message) {
		super(message);
	}
	
}
