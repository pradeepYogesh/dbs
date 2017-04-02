package com.concretepage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concretepage.dao.VisitDao;
import com.concretepage.entity.Visit;
import com.concretepage.service.CheckinService;

@Service
public class CheckinServiceImpl implements CheckinService{

	@Autowired
	VisitDao visitDao;
	
	@Override
	public void addCheckIn(Visit visit) {
		// TODO Auto-generated method stub
	
		visitDao.addVisit(visit);
	}

}
