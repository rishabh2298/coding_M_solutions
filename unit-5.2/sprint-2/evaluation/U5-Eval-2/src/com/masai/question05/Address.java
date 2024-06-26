package com.masai.question05;

import java.io.Serializable;

public class Address implements Serializable {
	
	private String state;
	private String city;
	private String pinCode;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String state, String city, String pinCode) {
		super();
		this.state = state;
		this.city = city;
		this.pinCode = pinCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", pinCode=" + pinCode + "]";
	}

}
