package com.app.BookMyShow.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bookmy_show")
public class BookMyShowDTO
{
	@Id
	@Column(name="alt_key")
	private long altKey;
	
	@Column(name="movie_budget")
	private String movieBudget;
	
	@Column(name="release_date")
	private String movieRelease;

	public long getAltKey() {
		return altKey;
	}

	public void setAltKey(long altKey) {
		this.altKey = altKey;
	}

	public String getMovieBudget() {
		return movieBudget;
	}

	public void setMovieBudget(String movieBudget) {
		this.movieBudget = movieBudget;
	}

	public String getMovieRelease() {
		return movieRelease;
	}

	public void setMovieRelease(String movieRelease) {
		this.movieRelease = movieRelease;
	}

	
	
}
