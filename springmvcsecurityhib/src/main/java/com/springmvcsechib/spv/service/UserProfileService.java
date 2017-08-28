package com.springmvcsechib.spv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springmvcsechib.spv.dao.IUserProfileDao;
import com.springmvcsechib.spv.model.UserProfile;
@Service("userProfileService")
@Transactional
public class UserProfileService implements IUserProfileService {
	@Autowired
	IUserProfileDao userProfileDao;
	
	@Override
	public UserProfile findById(Integer id) {
		return userProfileDao.findById(id);
	}

	@Override
	public UserProfile findByType(String type) {
		return userProfileDao.findByType(type);
	}

	@Override
	public List<UserProfile> findAll() {
		return userProfileDao.findAll();
	}
}
