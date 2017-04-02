package com.concretepage.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.concretepage.dao.SocialGraphDao;
import com.concretepage.entity.SocialGraph;

@Repository
@Transactional
public class SocialGraphDaoImpl implements SocialGraphDao{

	
	@PersistenceContext	
	private EntityManager entityManager;
	
	
	@Override
	public void addSocialGraph(SocialGraph graph) {
		// TODO Auto-generated method stub
		entityManager.persist(graph);
		
	}

}
