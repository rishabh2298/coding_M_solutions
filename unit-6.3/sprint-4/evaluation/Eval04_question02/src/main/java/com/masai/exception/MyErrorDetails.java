package com.masai.exception;

import java.time.LocalDateTime;

public class MyErrorDetails {
	
	private LocalDateTime dateTime;
	private String message;
	private String description;
	
	public MyErrorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
