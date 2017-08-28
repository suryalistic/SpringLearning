package com.springmvcsechib.spv.service;

import java.util.List;

import com.springmvcsechib.spv.model.User;

public interface IUserService {
	User findById(Integer id);

	User findBySSO(String sso);

	void saveUser(User user);

	void updateUser(User user);

	void deleteUserBySSO(String sso);

	List<User> findAllUsers(); 

	boolean isUserSSOUnique(Integer id, String sso);
}
