package com.masai.question01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student s1 = new Student(21, "Kali Das", 20, 20);
	
		System.out.println("Roll Number : "+ s1.getRollNumber());
		System.out.println("Student Name : "+ s1.getName());
		System.out.println("Student Age : "+ s1.getAge());
		System.out.println("Student Marks : "+ s1.getMarks());
		
		System.out.println();
		System.out.println("=========================");
		
		
		
		Student s2 = new Student();
		
		s2.setRollNumber(21);
		s2.setName("Jethalal Champaklal Gada");
		s2.setAge(10);
		s2.setMarks(400);
		
		System.out.println("Roll Number : "+ s2.getRollNumber());
		System.out.println("Student Name : "+ s2.getName());
		System.out.println("Student Age : "+ s2.getAge());
		System.out.println("Student Marks : "+ s2.getMarks());
	}

}
