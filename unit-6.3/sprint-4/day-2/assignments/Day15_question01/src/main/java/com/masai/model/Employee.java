package com.masai.model;

import java.time.LocalDate;

//import org.hibernate.validator.constraints.CreditCardNumber;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
//import com.fasterxml.jackson.core.JsonToken;
//import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empId;
	
	@NotNull
	@NotBlank
	@NotEmpty
	@Size(min = 3, max = 20)
	private String empName;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate dob;
	
	private String mobile;
	
	@Email
	private String email;
	
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private String password;
	
//	@CreditCardNumber
	private String creditCardNo;
	
	@Pattern(regexp = "^[0-9]{3}$")
	private String cvv;
	
	private Integer salary;

	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCreditCardNo() {
		return creditCardNo;
	}

	public void setCreditCardNo(String creditCardNo) {
		this.creditCardNo = creditCardNo;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", dob=" + dob + ", mobile=" + mobile + ", email="
				+ email + ", password=" + password + ", creditCardNo=" + creditCardNo + ", cvv=" + cvv + ", salary="
				+ salary + "]";
	}
	
	
}
