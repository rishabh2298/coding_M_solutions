package com.masai.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CabOwner {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ownerId;
	
	private String ownerName;
	
	private String phoneNumber;
	
	private String emailId;
	
	@Embedded
	private Cab cab;

	public CabOwner() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Cab getCab() {
		return cab;
	}

	public void setCab(Cab cab) {
		this.cab = cab;
	}

	@Override
	public String toString() {
		return "CabOwner [ownerId=" + ownerId + ", ownerName=" + ownerName + ", phoneNumber=" + phoneNumber
				+ ", emailId=" + emailId + ", cab=" + cab + "]";
	}
	
}
