package com.masai.model02;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@DiscriminatorValue("SERIES")
@NamedQueries({
	@NamedQuery(query = "select s from Series_02", name = "get all the series details"),
})
public class Series_02 extends HotStar_02 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int seriesId;
	private String seriesName;
	private int noOfEpisodes;
	
	public Series_02() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Series_02(String seriesName, int noOfEpisodes,String userName, double rating, Subscription subscriptionType) {
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
