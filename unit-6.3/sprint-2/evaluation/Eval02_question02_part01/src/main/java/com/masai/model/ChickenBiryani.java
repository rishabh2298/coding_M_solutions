package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "ChickenBiryaniId")
public class ChickenBiryani extends Biryani {

	private int price;
	private String description;
	
	public ChickenBiryani() {
		super();
		
	}

	public ChickenBiryani(int rating, int price, String description) {
		super(rating);
		
		this.price = price;
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ChickenBiryani [price=" + price + ", description=" + description + ", BiryaniId()=" + getBiryaniId()
				+ ", Rating()=" + getRating() + "]";
	}
	
	
	
}
