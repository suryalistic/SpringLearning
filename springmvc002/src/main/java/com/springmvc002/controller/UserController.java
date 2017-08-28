package com.springmvc002.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc002.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private  IUserService service;
	@RequestMapping(value="/home")
	public String home(ModelMap model, Authentication authentication) {
		authentication.getPrincipal();
		model.addAttribute("user", service.getUserByName(authentication.getName()));
		System.out.println("authentication.getPrincipal()>>>"+authentication.getPrincipal());
		System.out.println("authentication.getName()>>>"+authentication.getName());
 		return "userInfo";
 	}
	@RequestMapping(value="/error")
	public String error() {
 		return "accessDenied";
 	}
}
