package com.masai.model01;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "USER_ID")
public class Series extends HotStar {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int seriesId;
	private String seriesName;
	private int noOfEpisodes;
	
	public Series() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Series(String seriesName, int noOfEpisodes,String userName, double rating, Subscription subscriptionType) {
		super(userName, rating, subscriptionType);
		this.seriesName = seriesName;
		this.noOfEpisodes = noOfEpisodes;
	}

	public int getSeriesId() {
		return seriesId;
	}

	public void setSeriesId(int seriesId) {
		this.seriesId = seriesId;
	}

	public String getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public int getNoOfEpisodes() {
		return noOfEpisodes;
	}

	public void setNoOfEpisodes(int noOfEpisodes) {
		this.noOfEpisodes = noOfEpisodes;
	}

	@Override
	public String toString() {
		return "Series [seriesId=" + seriesId + ", seriesName=" + seriesName + ", noOfEpisodes=" + noOfEpisodes + "]";
	}
}
