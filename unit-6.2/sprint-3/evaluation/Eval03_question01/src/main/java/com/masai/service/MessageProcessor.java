package com.masai.service;

import org.springframework.stereotype.Service;

@Service
public interface MessageProcessor {
	
	public void processMessage(String message);

}
