package com.spv.springmvc001.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spv.springmvc001.service.LoginService;

@Controller
@SessionAttributes("name")
public class LoginController {
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String getLoginPage(){
		return "login";
	}
	
	@RequestMapping(value="gologin",method=RequestMethod.POST)
	public String login(@RequestParam String userName, @RequestParam String password, ModelMap map){
//		Log4JLogger log = Logger.getInstance(this.getClass())
		System.out.println("User Name="+userName + "\nPassword="+password);
//		if(StaticLoginService.validateUser(userName, password)){
		if(loginService.validateUser(userName, password)){
			map.put("name", userName);
			return "welcome";
		}else{
			map.put("errorMessage", "Invalid Login");
			return "login";
		}
	}
}
