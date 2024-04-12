package com.masai.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String email;
	
	private String address;
	
	private double balance;
	
	@Temporal(TemporalType.DATE)
	private Date date;
	
	public Account() {
		
	}

	public Account(int id, String email, String address, double balance, Date date) {
		super();
		this.id = id;
		this.email = email;
		this.address = address;
		this.balance = balance;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", address=" + address + ", balance=" + balance + ", date="
				+ date + "]";
	}

}
