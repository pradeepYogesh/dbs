package com.concretepage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.concretepage.entity.Rating;
import com.concretepage.service.RatingService;

@RestController
public class RatingServiceController {

	@Autowired
	RatingService ratingService;
	
	@RequestMapping("/rating")
	public void addRating(@RequestBody Rating rating ){		
		ratingService.addRating(rating);
	}
}
