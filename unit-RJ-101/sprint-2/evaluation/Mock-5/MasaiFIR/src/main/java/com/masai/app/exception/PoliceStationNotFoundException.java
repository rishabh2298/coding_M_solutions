package com.masai.app.exception;

public class PoliceStationNotFoundException extends RuntimeException {

	public PoliceStationNotFoundException() {
		
	}
	
	public PoliceStationNotFoundException(String message) {
		super(message);
	}
	
}
