package com.concretepage.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;
import com.concretepage.dao.UserDao;
import com.concretepage.entity.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDao{

	
	@PersistenceContext	
	private EntityManager entityManager;
	
	
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		
		entityManager.persist(user);		
		
	}

}
