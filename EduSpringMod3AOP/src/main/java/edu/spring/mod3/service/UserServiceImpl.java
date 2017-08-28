package edu.spring.mod3.service;

import edu.spring.mod3.beans.User;

public class UserServiceImpl {
	public void addUser(){
		System.out.println("UserServiceImpl>>addUser.");
	}
	
	public User getUser(String userName){
		System.out.println("calling UserServiceImpl.getUser.");
		User u = new User();
		u.setUserName(userName);
		return u;
	}
}