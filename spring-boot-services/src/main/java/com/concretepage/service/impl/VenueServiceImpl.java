package com.concretepage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concretepage.dao.VenueDao;
import com.concretepage.entity.Venue;
import com.concretepage.service.VenueService;

@Service
public class VenueServiceImpl implements VenueService{

	
	@Autowired
	VenueDao venueDao;
	
	@Override
	public void addVenue(Venue venue) {
		// TODO Auto-generated method stub
		venueDao.addVenue(venue);
	}

	
}
