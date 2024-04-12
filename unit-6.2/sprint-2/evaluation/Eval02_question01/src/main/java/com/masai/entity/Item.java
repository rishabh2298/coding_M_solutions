package com.masai.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int itemId;
	private String name;
	
	@Temporal(TemporalType.DATE)
	private LocalDate estimatedDeliveryDate;
	
	@Temporal(TemporalType.TIME)
	private LocalTime createAt;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "ORDER_ID")
	private Order order;

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(String name, LocalDate estimatedDeliveryDate, LocalTime createAt) {
		super();
		this.name = name;
		this.estimatedDeliveryDate = estimatedDeliveryDate;
		this.createAt = createAt;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getEstimatedDeliveryDate() {
		return estimatedDeliveryDate;
	}

	public void setEstimatedDeliveryDate(LocalDate estimatedDeliveryDate) {
		this.estimatedDeliveryDate = estimatedDeliveryDate;
	}

	public LocalTime getCreateAt() {
		return createAt;
	}

	public void setCreateAt(LocalTime createAt) {
		this.createAt = createAt;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", name=" + name + ", estimatedDeliveryDate=" + estimatedDeliveryDate
				+ ", createAt=" + createAt +"]";
	}

}
