package com.masai.question03;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = Student.getStudent(true);

		student.setName("Rancho");
		student.setRoll(35);
		student.setAddress(" Vandra (Mumbai)");
		
		System.out.println("College Name : "+ student.getCollageName());
		System.out.println("Student Name : "+ student.getName());
		System.out.println("Student Roll : " + student.getRoll());
		System.out.println("Student Address : "+ student.getAddress());
		
		System.out.println("==================================================");
		
		student = Student.getStudent(false);
		
		student.setCollageName("Masai");
		student.setName("Raju");
		student.setRoll(20);
		student.setAddress("Banglore");

		System.out.println("College Name : "+ student.getCollageName());
		System.out.println("Student Name : "+ student.getName());
		System.out.println("Student Roll : " + student.getRoll());
		System.out.println("Student Address : "+ student.getAddress());
		

	}

}
