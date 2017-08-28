package com.springmvc002.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc002.domain.UserInfo;

@Repository
@Transactional(propagation = Propagation.REQUIRES_NEW, isolation= Isolation.READ_COMMITTED) 
public class UserDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	public UserInfo getActiveUser(String userName) {
		UserInfo activeUserInfo = new UserInfo();
		short enabled = 1;
		List<?> list = hibernateTemplate.find("FROM Users WHERE userName=? and enabled=?",userName, enabled);
		if(!list.isEmpty()) {
			activeUserInfo = (UserInfo)list.get(0);
		}
		return activeUserInfo;
	}
} 
