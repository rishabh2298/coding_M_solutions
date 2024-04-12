package com.masai;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
	
	@Autowired
	@Qualifier("stu")
	public List<Student> studentList = new ArrayList<>();
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ControlMethod cm = ctx.getBean(ControlMethod.class,"controlMethod");
		
		System.out.println("============================");
		
		System.out.println(cm.list1);
		System.out.println();
		cm.list2.forEach(s-> System.out.println(s));
		
		System.out.println("============================");
		
		
		
		AnnotationConfigApplicationContext ctx2 = (AnnotationConfigApplicationContext)ctx;

		ctx2.close();
	}

}
