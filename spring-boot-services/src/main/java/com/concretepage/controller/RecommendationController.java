package com.concretepage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.concretepage.entity.Venue;
import com.concretepage.service.RecommendationService;
import com.concretepage.service.impl.VenueServiceImpl;

@RestController
public class RecommendationController {
	
	@Autowired
	RecommendationService recommendationService;
	
	@RequestMapping(value="/user/{userId}/recommend")
	public List<Venue> getRecommendationByUser( @PathVariable("userId") Integer userId ){
		
		return recommendationService.getVenuesRecommendation(userId);
		
	}
	
}
