package com.masai.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer studentId;
	
	@NotNull
	@NotEmpty
	@NotBlank
	@Size(min = 3, max = 10, message = "name should be between 3 to 10 characters")
	private String studentName;
	
	@NotNull
	@Valid
	@Embedded
	private Address address;
	
	@NotNull
	@Min(value = 13, message = "age should be greater than 12")
	private Integer age;
	
	@NotNull
	@NotEmpty
	@NotBlank
	@Email
	@Column(unique = true)
	private String email;
	
	@NotNull
	@NotEmpty
	@NotBlank
	@Pattern(regexp = "[6-9]{1}[0-9]{9}")
	private String mobile;
	
	@NotNull
	private Gender gender;
	
	@NotNull
	private LocalDate dob;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	public Integer getStudentId() {
		return studentId;
	}


	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public Gender getGender() {
		return gender;
	}


	public void setGender(Gender gender) {
		this.gender = gender;
	}


	public LocalDate getDob() {
		return dob;
	}


	public void setDob(LocalDate dob) {
		this.dob = dob;
	}


	
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", address=" + address + ", age="
				+ age + ", email=" + email + ", mobile=" + mobile + ", gender=" + gender + ", dob=" + dob + "]";
	}
	
	
}
