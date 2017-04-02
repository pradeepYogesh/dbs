package com.concretepage.dao;

import java.util.List;

import com.concretepage.entity.Venue;

public interface VenueDao {

	public void addVenue(Venue venue);
	
	public List<Venue> getVenuesByRecommendation(Integer userId);
}
