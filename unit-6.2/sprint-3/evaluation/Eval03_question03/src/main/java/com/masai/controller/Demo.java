package com.masai.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.masai.service.PersonService;

public class Demo {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		PersonService service = context.getBean(PersonService.class, "personService");
		
		
		service.printPersonList();
		
		service.printSkillMap();
		
		
		ClassPathXmlApplicationContext ctx = (ClassPathXmlApplicationContext)context;
		
		ctx.close();
		
	}

}
