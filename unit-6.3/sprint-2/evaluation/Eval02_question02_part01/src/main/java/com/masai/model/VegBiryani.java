package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "VegBiryaniId")
@NamedQueries({
	@NamedQuery(query = "select v from VegBiryani v where v.biryaniId=:id", name = "VegBiryani.byId")
})
public class VegBiryani extends Biryani {
	
	private int price;
	private String description;
	
	public VegBiryani() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VegBiryani(int rating ,int price, String description) {
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
		return "VegBiryani [price=" + price + ", description=" + description + ", BiryaniId=" + getBiryaniId()
				+ ", Rating()=" + getRating() + "]";
	}

	
	
	

}
