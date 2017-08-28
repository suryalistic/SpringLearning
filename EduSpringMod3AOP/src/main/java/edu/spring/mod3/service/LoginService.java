package edu.spring.mod3.service;

import edu.spring.mod3.beans.User;

public class LoginService {

	public boolean login(User u){
		System.out.println("LoginService.login with "+u);
		return true;
	}
	
	public boolean authenticate(User u) throws Exception{
		if(u.getPassword().length() < 8){
			throw new Exception("Password length is too short");
		}
		return true;
	}
}
