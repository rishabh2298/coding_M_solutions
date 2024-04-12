package com.masai.entity;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	private String deliveryAddress;
	private double totalAmount;
	
	@Temporal(TemporalType.TIME)
	private LocalTime createAt;
	
	@OneToMany(mappedBy = "order" , fetch = FetchType.EAGER)
	private List<Item> items = new ArrayList<Item>();

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(String deliveryAddress, double totalAmount, LocalTime createAt) {
		super();
		this.deliveryAddress = deliveryAddress;
		this.totalAmount = totalAmount;
		this.createAt = createAt;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public LocalTime getCreateAt() {
		return createAt;
	}

	public void setCreateAt(LocalTime createAt) {
		this.createAt = createAt;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", deliveryAddress=" + deliveryAddress + ", totalAmount=" + totalAmount
				+ ", createAt=" + createAt +"]";
	}
	
}
