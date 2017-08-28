package com.spv.springmvc001.service;

public class StaticLoginService {
	public static boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("surya") && password.equals("dummy");
	}
}