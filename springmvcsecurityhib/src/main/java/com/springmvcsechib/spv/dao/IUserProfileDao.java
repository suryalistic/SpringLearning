package com.springmvcsechib.spv.dao;

import java.util.List;

import com.springmvcsechib.spv.model.UserProfile;

public interface IUserProfileDao {
	List<UserProfile> findAll();
	UserProfile findByType(String type);
	UserProfile findById(Integer id);
}
