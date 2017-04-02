package com.concretepage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concretepage.dao.RatingDao;
import com.concretepage.entity.Rating;
import com.concretepage.service.RatingService;

@Service
public class RatingServiceImpl implements RatingService{
	
	@Autowired
	RatingDao ratingDao;
	
	@Override
	public void addRating(Rating rating) {
		// TODO Auto-generated method stub
		ratingDao.addRating(rating);
	}

}
