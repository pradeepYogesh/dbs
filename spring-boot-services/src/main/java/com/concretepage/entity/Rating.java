package com.concretepage.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ratings")
public class Rating implements Serializable{
	
	
	@EmbeddedId
	RatingId id;
	
	
	public RatingId getId() {
		return id;
	}

	public void setId(RatingId id) {
		this.id = id;
	}	
	
	@Column
	int rating;	

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
}
