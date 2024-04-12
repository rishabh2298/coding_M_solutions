package com.masai.question01;

public class Instructor extends Person {

	int instructorId;
	int salary;
	
	
	@Override
	public String toString() {
		return "Instructor [instructorId=" + instructorId + ", salary=" + salary + 
				", address=Address [city="+address.city+", state="+address.state
				+", pinCode="+address.pinCode+"]]";
	}
	
}
