package com.masai.question01;

public class Student extends Person {

	int studentId;
	String courseEnrolled;
	int courseFee;
	
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", courseEnrolled=" + courseEnrolled + ", courseFee=" + courseFee
				+", address=Address [city="+address.city+", state=" + address.state+", pincode="+
				address.pinCode+"]]";
	}
	
}
