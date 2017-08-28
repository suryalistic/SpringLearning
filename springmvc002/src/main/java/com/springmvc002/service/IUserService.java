package com.springmvc002.service;

import org.springframework.security.access.annotation.Secured;

import com.springmvc002.domain.UserInfo;

public interface IUserService {
	@Secured ({"ROLE_ADMIN", "ROLE_USER"})
	public UserInfo getUserByName(String name);
}
