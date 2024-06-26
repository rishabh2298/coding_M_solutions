package com.masai.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Shipment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int shipmentId;
	private String packageNumber;
	private String content;
	private double weight;
	private String senderAddress;
	private String recipientAddress;
	private LocalDateTime createdTimeStamp;
	
	public Shipment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shipment(String packageNumber, String content, double weight, String senderAddress,
			String recipientAddress) {
		super();
		this.packageNumber = packageNumber;
		this.content = content;
		this.weight = weight;
		this.senderAddress = senderAddress;
		this.recipientAddress = recipientAddress;
	}

	public int getShipmentId() {
		return shipmentId;
	}

	public void setShipmentId(int shipmentId) {
		this.shipmentId = shipmentId;
	}

	public String getPackageNumber() {
		return packageNumber;
	}

	public void setPackageNumber(String packageNumber) {
		this.packageNumber = packageNumber;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getSenderAddress() {
		return senderAddress;
	}

	public void setSenderAddress(String senderAddress) {
		this.senderAddress = senderAddress;
	}

	public String getRecipientAddress() {
		return recipientAddress;
	}

	public void setRecipientAddress(String recipientAddress) {
		this.recipientAddress = recipientAddress;
	}

	public LocalDateTime getCreatedTimeStamp() {
		return createdTimeStamp;
	}

	public void setCreatedTimeStamp(LocalDateTime createdTimeStamp) {
		this.createdTimeStamp = createdTimeStamp;
	}

	@Override
	public String toString() {
		return "Shipment [shipmentId=" + shipmentId + ", packageNumber=" + packageNumber + ", content=" + content
				+ ", weight=" + weight + ", senderAddress=" + senderAddress + ", recipientAddress=" + recipientAddress
				+ ", createdTimeStamp=" + createdTimeStamp + "]";
	}

}
