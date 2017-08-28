package com.springmvcsechib.spv.dao;

import java.util.List;

import com.springmvcsechib.spv.model.User;

public interface IUserDao {
	public User findById(Integer id);
	public User findBySSO(String sso);
	public void save(User user);
	public void deleteBySSO(String sso);
	public List<User> findAllUsers();
	public void updateUser(User user);
}
