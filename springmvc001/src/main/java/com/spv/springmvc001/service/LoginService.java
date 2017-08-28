package com.spv.springmvc001.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public  boolean validateUser(String user, String password) {
		System.out.println("Autowired> LoginService>>>");
		return user.equalsIgnoreCase("surya") && password.equals("dummy");
	}
}
