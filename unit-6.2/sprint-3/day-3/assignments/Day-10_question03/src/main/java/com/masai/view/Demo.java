package com.masai.view;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.masai.controller.Operator;
import com.masai.util.AppConfig;
import com.masai.util.DataBase;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		Operator operator = context.getBean(Operator.class);
		
		
		System.out.println();
		System.out.println();
		
		System.out.println("Choose your operation Number");
		System.out.println("============================");
		
		System.out.println();
		System.out.println();
		
		System.out.println("1. To Add Student");
		System.out.println("2. To Get Student Details by roll number");
		
		Scanner scanner = new Scanner(System.in);
		
		int choice = scanner.nextInt();
		
		if(choice==1) {
			operator.addStudent();
		}
		else {
			operator.getStudent();
		}
		
		
//		DataBase dataBase = context.getBean(DataBase.class,"dataBase");
//		
//		dataBase.print();
		
	}
	
}
