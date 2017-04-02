package com.concretepage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concretepage.dao.VisitDao;
import com.concretepage.entity.Visit;
import com.concretepage.service.VisitService;

@Service
public class VisitServiceImpl implements VisitService{

	@Autowired
	VisitDao visitDao;	

	@Override
	public void saveVisit(Visit visit) {
		// TODO Auto-generated method stub
		
		visitDao.addVisit(visit);
	}
	
	
	
}
