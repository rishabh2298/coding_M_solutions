package com.masai.service;

import org.springframework.stereotype.Service;

import com.masai.model.MessageService;

@Service
public class MessageProcessorImpl implements MessageProcessor {

	MessageService messageService;
	
	
	
	
	public MessageProcessorImpl() {
		
	}
	
	public MessageProcessorImpl(MessageService service) {
		this.messageService = service;
	}
	
	
	
	
	@Override
	public void processMessage(String message) {
		messageService.sendMessage(message);
	}
	
	

	public MessageService getMessageService() {
		return messageService;
	}

	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}

}
