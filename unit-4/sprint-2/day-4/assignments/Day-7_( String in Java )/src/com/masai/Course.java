package com.masai;

import java.util.Scanner;

public class Course {
	

	int courseId;
	String courseName;
	int courseFee;
	
	
	void displayCourseDetails() {
		System.out.println("Course Id : "+ this.courseId);
		System.out.println("Course Name : "+ this.courseName);
		System.out.println("Course Fee : "+ this.courseFee);
	}
	
	
	static void authenticate(String userName, String password) {
		
		if(userName == "Admin" && password == "1234") {
			
			Scanner scanner = new Scanner(System.in);
			
			Course course = new Course();
			
			System.out.print("Enter Course Id : ");
			int id = scanner.nextInt();
			course.courseId = id;
			
			scanner.nextLine();
			System.out.print("Enter Course Name : ");
			String name = scanner.nextLine();
			course.courseName = name;
			
			System.out.print("Enter Course Fee : ");
			int fee = scanner.nextInt();
			course.courseFee = fee;
			
			course.displayCourseDetails();
			scanner.close();
			
			System.out.println("================");
			
		}
		else {
			System.out.println("Invalid UserName or Password");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		authenticate("Admin" , "1234");
		authenticate("Admin", "123");
		
	}

}
