package com.concretepage.service;

import java.util.List;

import com.concretepage.entity.Venue;

public interface RecommendationService {

	public List<Venue> getVenuesRecommendation(Integer userId);
}
