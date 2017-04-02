package com.concretepage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.concretepage.entity.Venue;
import com.concretepage.service.VenueService;

@RestController
public class VenueController {

	
	@Autowired
	VenueService venueService;
	
	
	@RequestMapping(value="/venue",method=RequestMethod.POST)
	public void insertVenue(@RequestBody Venue venue){
	
		venueService.addVenue(venue);
	}
	
}
