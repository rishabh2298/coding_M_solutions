package com.masai.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@DiscriminatorValue(value = "Chicken")
@NamedQueries({
	@NamedQuery(query = "select c from ChickenBiryani c where c.biryaniId = :id" , name = "ChickenBiryani.byId"),
	@NamedQuery(query = "select c from ChickenBiryani c where c.price BETWEEN 0 AND 499", name = "ChickenBiryani.lessThan500")
})
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
