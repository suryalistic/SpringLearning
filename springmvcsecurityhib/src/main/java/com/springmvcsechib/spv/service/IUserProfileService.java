package com.springmvcsechib.spv.service;

import java.util.List;

import com.springmvcsechib.spv.model.UserProfile;

public interface IUserProfileService {
	public UserProfile findById(Integer id);
	public UserProfile findByType(String type);
	public List<UserProfile> findAll();
}
