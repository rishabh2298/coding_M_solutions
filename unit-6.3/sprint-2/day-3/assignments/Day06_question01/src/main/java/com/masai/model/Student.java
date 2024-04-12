package com.masai.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "studgen")
	@SequenceGenerator(name = "studgen", sequenceName = "student_generator", initialValue = 50, allocationSize = 5)
	private int studentRoll;
	
	@Column(nullable = false)
	private String studentName;
	
	@Column(nullable = false)
	private String mobileNumber;
	
	@Column(nullable = false, unique = true)
	private String email;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "clg_id")
	private Collage collage;

	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public int getStudentRoll() {
		return studentRoll;
	}

	public void setStudentRoll(int studentRoll) {
		this.studentRoll = studentRoll;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Collage getCollage() {
		return collage;
	}

	public void setCollage(Collage collage) {
		this.collage = collage;
	}

	
	@Override
	public String toString() {
		return "Student [studentRoll=" + studentRoll + ", studentName=" + studentName + ", mobileNumber=" + mobileNumber
				+ ", email=" + email + ", collage=" + collage + "]";
	}
	

}
