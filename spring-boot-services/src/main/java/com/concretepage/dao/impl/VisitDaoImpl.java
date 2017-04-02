package com.concretepage.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.concretepage.dao.VisitDao;
import com.concretepage.entity.Visit;

@Repository
@Transactional
public class VisitDaoImpl implements VisitDao{

	
	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public void addVisit(Visit visit) {
		// TODO Auto-generated method stub
		entityManager.persist(visit);
	}

	
}
