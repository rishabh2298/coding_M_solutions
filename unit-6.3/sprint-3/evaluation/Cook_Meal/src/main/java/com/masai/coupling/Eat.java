package com.masai.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Eat {
	
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		Food breakfast = ctx.getBean("breakFast", BreakFast.class);
		
		Food lunch = ctx.getBean("lunch", Lunch.class);
		
		Food dinner = ctx.getBean("dinner", Dinner.class);
		
		
		// loose coupling
		
		breakfast.cook();
		lunch.cook();
		dinner.cook();
	}

}
