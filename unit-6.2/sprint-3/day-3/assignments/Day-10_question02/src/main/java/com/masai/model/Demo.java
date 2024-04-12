package com.masai.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.masai.util.AppConfig;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Travel travel = ctx.getBean(Travel.class, "travel");
		
		
		Car car = ctx.getBean(Car.class, "car");
		
		car.fun1();
		
		
		
		Bike bike = ctx.getBean(Bike.class, "hayabuza");
		
		bike.fun2();
		
		
		
//		AnnotationConfigApplicationContext context = (AnnotationConfigApplicationContext)ctx;
//		
//		context.close();
	}
	
}
