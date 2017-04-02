package com.concretepage.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concretepage.dao.VenueDao;
import com.concretepage.entity.Venue;
import com.concretepage.service.RecommendationService;

@Service
public class RecommendationServiceImpl implements RecommendationService{

	
	@Autowired
	VenueDao venueDao;	


	@Override
	public List<Venue> getVenuesRecommendation(Integer userId) {
		// TODO Auto-generated method stub
		return venueDao.getVenuesByRecommendation(userId);
	}
	
}
