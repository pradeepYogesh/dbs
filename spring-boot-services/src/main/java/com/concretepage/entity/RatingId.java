package com.concretepage.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class RatingId implements Serializable{
	
	public RatingId(int userId,int venueId){
		this.userId=userId;
		this.venueId=venueId;
	}
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getVenueId() {
		return venueId;
	}

	public void setVenueId(int venueId) {
		this.venueId = venueId;
	}

	@Column(name="user_id", nullable = false, insertable = false, updatable = false)
	int userId;

	@Column(name="venue_id", nullable = false, insertable = false, updatable = false)
	int venueId;
	

}
