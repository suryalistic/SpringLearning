package com.springmvcsechib.spv.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springmvcsechib.spv.dao.IUserDao;
import com.springmvcsechib.spv.model.User;

@Service("userService")
@Transactional
public class UserService implements IUserService {
	@Autowired
	IUserDao userDao;
	
	@Override
	public User findById(Integer id) {
		return userDao.findById(id);
	}

	@Override
	public User findBySSO(String sso) {
		return userDao.findBySSO(sso);
	}

	@Override
	public void saveUser(User user) {
		userDao.save(user);
	}

	@Override
	public void updateUser(User user) {
		User updatableUser = userDao.findById(user.id);
		if(updatableUser != null){
			BeanUtils.copyProperties(user, updatableUser);
			userDao.updateUser(updatableUser);
		}
	}

	@Override
	public void deleteUserBySSO(String sso) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isUserSSOUnique(Integer id, String sso) {
		// TODO Auto-generated method stub
		return false;
	}

}
