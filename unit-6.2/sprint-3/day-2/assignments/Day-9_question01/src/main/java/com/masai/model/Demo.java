package com.masai.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		HolidayPackage hp = ctx.getBean(HolidayPackage.class, "package02");
		
		hp.showDetails();
	}

}
