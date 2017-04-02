package com.concretepage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.concretepage.entity.Visit;
import com.concretepage.service.VisitService;

@RestController
public class VisitController {

	
	@Autowired
	VisitService visitingService;
	
	@RequestMapping(value="/visit", method=RequestMethod.POST )
	public void addVisit(@RequestBody Visit visit){
		
		visitingService.saveVisit(visit);
	}
	
}
