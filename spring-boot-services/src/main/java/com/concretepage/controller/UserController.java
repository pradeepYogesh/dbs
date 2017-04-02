package com.concretepage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.concretepage.dao.UserDao;
import com.concretepage.entity.User;

@RestController
public class UserController {	
	
	@Autowired
	UserDao userDao;
	
	@RequestMapping("/user")
	public void addUser(@RequestBody User user){
		
		userDao.addUser(user);
		
	}
	
}
