package com.masai.usecase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.masai.services.DeveloperService;

public class Demo {
	
	public static void main(String[] args) {
		
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		DeveloperService service = ctx.getBean("developerService", DeveloperService.class);
		
		
		service.printProjectMap();
		
		
		service.printDeveloperList();
		
		
		((ClassPathXmlApplicationContext)ctx).close();
		
	}

}
