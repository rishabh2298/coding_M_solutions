package com.masai.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Biryani_Type", discriminatorType = DiscriminatorType.STRING)
public class Biryani {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int biryaniId;
	private int rating;
	
	public Biryani() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Biryani(int rating) {
		super();
		this.rating = rating;
	}
	
	
	

	public int getBiryaniId() {
		return biryaniId;
	}

	public void setBiryaniId(int biryaniId) {
		this.biryaniId = biryaniId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Biryani [biryaniId=" + biryaniId + ", rating=" + rating + "]";
	}
	
}
