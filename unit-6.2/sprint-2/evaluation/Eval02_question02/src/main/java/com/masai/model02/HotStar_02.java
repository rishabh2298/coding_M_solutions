package com.masai.model02;

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
@DiscriminatorColumn(name = "Service_Type", discriminatorType = DiscriminatorType.STRING)
public class HotStar_02 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String userName;
	private double rating;
	private Subscription subscriptionType;
	
	public HotStar_02() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HotStar_02(String userName, double rating, Subscription subscriptionType) {
		super();
		this.userName = userName;
		this.rating = rating;
		this.subscriptionType = subscriptionType;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public Subscription getSubscriptionType() {
		return subscriptionType;
	}

	public void setSubscriptionType(Subscription subscriptionType) {
		this.subscriptionType = subscriptionType;
	}

	@Override
	public String toString() {
		return "HotStar [userId=" + userId + ", userName=" + userName + ", rating=" + rating + ", subscriptionType="
				+ subscriptionType + "]";
	}
	
}
