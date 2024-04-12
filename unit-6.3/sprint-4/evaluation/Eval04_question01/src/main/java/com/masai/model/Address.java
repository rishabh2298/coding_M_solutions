package com.masai.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class Address {
	
	@NotNull
	@NotEmpty
	@NotBlank
	@Pattern(regexp = "^[1-6]{1}[0-9]{5}$")
	private String pincode;
	
	@NotNull
	@NotEmpty
	@NotBlank
	private String state;
	
	@NotNull
	@NotEmpty
	@NotBlank
	private String city;
	
	
	public Address(String pincode, String state, String city) {
		super();
		this.pincode = pincode;
		this.state = state;
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
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

	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", state=" + state + ", city=" + city + "]";
	}
	
}
