package com.masai.model;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PaySlip {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int paySlipId;
	
	@Enumerated(EnumType.STRING)
	private Month month;
	private int salay;
	private LocalDateTime createdAt;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	Employee employee;

	
	
	public PaySlip() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaySlip(Month month, int salay, LocalDateTime createdAt) {
		super();
		this.month = month;
		this.salay = salay;
		this.createdAt = createdAt;
	}

	public int getPaySlipId() {
		return paySlipId;
	}

	public void setPaySlipId(int paySlipId) {
		this.paySlipId = paySlipId;
	}

	public Month getMonth() {
		return month;
	}

	public void setMonth(Month month) {
		this.month = month;
	}

	public int getSalay() {
		return salay;
	}

	public void setSalay(int salay) {
		this.salay = salay;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "PaySlip [paySlipId=" + paySlipId + ", month=" + month + ", salay=" + salay + ", createdAt=" + createdAt
				+ "]";
	}

	
	
}
