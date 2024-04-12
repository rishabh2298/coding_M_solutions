package com.masai.question01;

public class Main {
	
	public static Person generatePerson(Person person) {
		if(person instanceof Student) {
			return new Student();
		}
		else {
			return new Instructor();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person newStudent = generatePerson(new Student());
		Person newTeacher = generatePerson(new Instructor());
		
		Student student = (Student)newStudent;
		student.studentId = 1;
		student.courseFee = 300000;
		student.courseEnrolled = "JA111";
		student.address.city = "Chennai";
		student.address.state = "TN";
		student.address.pinCode = "60001";
		
		Instructor instructor = (Instructor)newTeacher;
		instructor.instructorId = 456;
		instructor.salary = 45612;
		instructor.address.city = "Chennai";
		instructor.address.state = "TN";
		instructor.address.pinCode = "60001";
		
		System.out.println(student);
		System.out.println(instructor);
		
	}

}
