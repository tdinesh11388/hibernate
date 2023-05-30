package com.app.BookMyShow.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bookmy_show")
public class BookMyShowEntity  implements Serializable
{
	@Id
	@Column(name="alt_key")
	private long altKey;
	
	@Column(name="movie_name")
	private String movieName;
	
	@Column(name="actor_name")
	private String actorName;
	
	@Column(name="actress_name")
	private String actressName;
	
	@Column(name="movie_rating")
	private String movieRating;
	
	@Column(name="movie_budget")
	private String movieBudget;
	
	@Column(name="release_date")
	private String releaseDate;

	public long getAltKey() {
		return altKey;
	}

	public void setAltKey(long altKey) {
		this.altKey = altKey;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public String getActressName() {
		return actressName;
	}

	public void setActressName(String actressName) {
		this.actressName = actressName;
	}

	public String getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(String movieRating) {
		this.movieRating = movieRating;
	}

	public String getMovieBudget() {
		return movieBudget;
	}

	public void setMovieBudget(String movieBudget) {
		this.movieBudget = movieBudget;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	
	  @Override public String toString() { return "BookMyShowEntity [altKey=" +
	  altKey + ", movieName=" + movieName + ", actorName=" + actorName +
	  ", actressName=" + actressName + ", movieRating=" + movieRating +
	  ", movieBudget=" + movieBudget + ", releaseDate=" + releaseDate + "]"; }
	 
}
