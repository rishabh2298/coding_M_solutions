package com.masai.app.exception;

import java.time.LocalDateTime;

public class MyErrorDetails {
	
	private LocalDateTime localDateTime;
	private String message;
	
	public MyErrorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyErrorDetails(LocalDateTime localDateTime, String message) {
		super();
		this.localDateTime = localDateTime;
		this.message = message;
	}

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
