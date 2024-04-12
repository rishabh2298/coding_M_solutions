package com.masai;

public class Student {
	
	int roll;
	String name;
	int marks;
	
	void displayStudentDetails() {
		System.out.println("Roll is : "+roll);
		System.out.println("Name is : "+name);
		System.out.println("Marks is : "+marks);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		
		s1.name = "Bahubali";
		s1.roll = 21 ;
		s1.marks = 100 ;
		
		s1.displayStudentDetails();
		s1 = null;
		
		
		
		Student s2 = new Student();
		
		s2.roll = 45;
		s2.name = "Duryodhan";
		s2.marks = 0;
		
	    s2.displayStudentDetails();
	    s2 = null;
	}

}
