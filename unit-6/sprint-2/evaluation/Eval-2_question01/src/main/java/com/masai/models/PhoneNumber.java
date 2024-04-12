package com.masai.models;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class PhoneNumber {
	
	private int phoneId;
	
	private String phoneNumber;
	
	@Enumerated
	private String PhoneType;
	
	@Id
	private int userId;
	
	

	public PhoneNumber() {
		super();
	}
	
	

	public int getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneType() {
		return PhoneType;
	}

	public void setPhoneType(String phoneType) {
		PhoneType = phoneType;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}



	@Override
	public String toString() {
		return "PhoneNumber [phoneId=" + phoneId + ", phoneNumber=" + phoneNumber + ", PhoneType=" + PhoneType
				+ ", userId=" + userId + "]";
	}

}
