package com.masai.app.exception;

public class MailNotFoundException extends RuntimeException {

	
	public MailNotFoundException() {
		
	}
	
	
	public MailNotFoundException(String message) {
		super(message);
	}
	
	
}
