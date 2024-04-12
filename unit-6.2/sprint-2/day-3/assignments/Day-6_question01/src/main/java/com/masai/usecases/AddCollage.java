package com.masai.usecases;

import java.util.Scanner;

import com.masai.model.Collage;
import com.masai.model.Student;
import com.masai.service.CollageService;
import com.masai.service.CollageServiceImpl;

public class AddCollage {
	
	public static void main(String[] args) {
		
		// collage details
		
		Collage collage1 = new Collage();
		
		collage1.setCollageName("NIT-Delhi");
		collage1.setCollageAddress("Delhi near IIT-Delhi");
		
		
		Collage collage2 = new Collage();
		
		collage2.setCollageName("NSIT");
		collage2.setCollageAddress("Near Metro Delhi");
		
		
		
		// Student Details
		
		Student student1 = new Student();
		
		student1.setStudentName("Hari Sahu");
		student1.setMobileNumber("98984 44434");
		student1.setEmail("hari@gmail.com");
		
		
		Student student2 = new Student();
		
		student2.setStudentName("Ajay Tiwari");
		student2.setMobileNumber("56876 77873");
		student2.setEmail("tiwariji@gmail.com");
		
		
		
		Student student3 = new Student();
		
		student3.setStudentName("Kamla Kale");
		student3.setMobileNumber("87984 98934");
		student3.setEmail("kale@gmail.com");
		
		
		
		Student student4 = new Student();
		
		student4.setStudentName("Hari Sahu");
		student4.setMobileNumber("98984 44434");
		student4.setEmail("hari@gmail.com");
		
		
		// Assosiate Collage with Student;
		
		student1.setCollage(collage1);
		student2.setCollage(collage1);
		student3.setCollage(collage1);
		student4.setCollage(collage1);
		

		student1.setCollage(collage2);
		student2.setCollage(collage2);
		student3.setCollage(collage2);
		student4.setCollage(collage2);
		
		
		// Assosiate Student with Collage
		
		collage1.getStudents().add(student3);
		collage1.getStudents().add(student2);
		collage1.getStudents().add(student4);
		collage1.getStudents().add(student1);
		

		collage2.getStudents().add(student4);
		collage2.getStudents().add(student1);
		collage2.getStudents().add(student3);
		collage2.getStudents().add(student2);
		
		
		
		CollageService collageService = new CollageServiceImpl();
		
		collageService.addCollage(collage1);
		collageService.addCollage(collage2);
		
		
		
		
	}

}
