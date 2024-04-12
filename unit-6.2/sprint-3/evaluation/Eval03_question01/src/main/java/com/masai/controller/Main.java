package com.masai.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.masai.model.EmailService;
import com.masai.model.SmsService;
import com.masai.model.TwitterService;
import com.masai.service.MessageProcessorImpl;
import com.masai.util.AppConfig;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		MessageProcessorImpl processor1 = context.getBean(MessageProcessorImpl.class,"messageProcessorImpl");
		MessageProcessorImpl processor2 = context.getBean(MessageProcessorImpl.class,"messageProcessorImpl");
		MessageProcessorImpl processor3 = context.getBean(MessageProcessorImpl.class,"messageProcessorImpl");
		
		processor1.setMessageService(new EmailService());
		processor2.setMessageService(new SmsService());
		processor3.setMessageService(new TwitterService());
		
		processor1.processMessage("hello SIr");
		processor2.processMessage("hello SIr");
		processor3.processMessage("hello SIr");
		
	}

}
