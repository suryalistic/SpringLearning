package com.springmvc002.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.springmvc002.dao.UserDao;
import com.springmvc002.domain.UserInfo;

public class UserService  implements IUserService{

	@Autowired
	public UserDao userDao;

	@Override
	public UserInfo getUserByName(String name) {
		return userDao.getActiveUser(name);
	}
}
