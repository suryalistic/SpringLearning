package com.spv.springmvc001.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String login(ModelMap map){
		map.put("name", "surya");
		return "welcome";
	}
	
	public String getLoggedInUserName(){
		Object userPrincipal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if(userPrincipal instanceof UserDetails){
			return 	((UserDetails)userPrincipal).getUsername();
		}
		return userPrincipal.toString();
	}
}
