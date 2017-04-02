package com.concretepage.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
//@Table(name="socialgraph")
public class SocialGraph {
	
	@EmbeddedId
	SocialGraphId id;	
	
	@Column(name="first_user_id",insertable=false, updatable=false)
	int firstUserId;
	
	@Column(name="second_user_id",insertable=false, updatable=false)
	int secondUserId;

	public int getFirstUserId() {
		return firstUserId;
	}

	public void setFirstUserId(int firstUserId) {
		this.firstUserId = firstUserId;
	}

	public int getSecondUserId() {
		return secondUserId;
	}

	public void setSecondUserId(int secondUserId) {
		this.secondUserId = secondUserId;
	}
	
	
}
