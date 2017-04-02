package com.concretepage.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.concretepage.dao.RatingDao;
import com.concretepage.entity.Rating;

@Repository
@Transactional
public class RatingDaoImpl implements RatingDao{

	
	@PersistenceContext	
	private EntityManager entityManager;
	
	
	@Override
	public void addRating(Rating rating) {
		// TODO Auto-generated method stub
		entityManager.persist(rating);
	}

}
