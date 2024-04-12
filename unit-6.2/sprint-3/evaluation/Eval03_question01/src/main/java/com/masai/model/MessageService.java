package com.masai.model;

import org.springframework.stereotype.Component;

@Component
public interface MessageService {
	
	public void sendMessage(String message);

}
