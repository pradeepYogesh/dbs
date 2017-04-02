package com.concretepage.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.concretepage.dao.VenueDao;
import com.concretepage.entity.Venue;

@Repository
@Transactional
public class VenueDaoImpl implements VenueDao{

	

	@PersistenceContext	
	private EntityManager entityManager;
	
	@Override
	public void addVenue(Venue venue) {
		// TODO Auto-generated method stub
		
		entityManager.persist(venue);
		
	}

	@Override
	public List<Venue> getVenuesByRecommendation(Integer userId) {
		// TODO Auto-generated method stub
		
		return new ArrayList();
	}

}
