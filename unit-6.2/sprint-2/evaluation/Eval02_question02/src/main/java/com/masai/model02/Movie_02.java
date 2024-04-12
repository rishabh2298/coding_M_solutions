package com.masai.model02;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@DiscriminatorValue("MOVIE")
@NamedQueries({
	@NamedQuery(query = "select m from Movie_02 where movieId = :id" , name="get movie by id")
})
public class Movie_02 extends HotStar_02 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int movieId;
	private String movieName;
	private String genre;
	
	public Movie_02() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Movie_02(String userName, double rating, Subscription subscriptionType, String movieName, String genre) {
		super(userName, rating, subscriptionType);
		this.movieName = movieName;
		this.genre = genre;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", genre=" + genre + "]";
	}
	
}
