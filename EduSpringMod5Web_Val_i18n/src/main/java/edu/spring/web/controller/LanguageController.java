package edu.spring.web.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Controller
public class LanguageController {

	@Autowired
	SessionLocaleResolver localeResolver;
	
	@RequestMapping(method=RequestMethod.GET,value="/langTest")
	public String redirectByLang(HttpSession session, HttpServletRequest request){
		System.out.println("selected Language>>"+request.getParameter("lang"));
		localeResolver.setDefaultLocale(new Locale(request.getParameter("lang")));
		System.out.println("sessionLocaleResolver>>"+localeResolver.resolveLocale(request));
		return "welcome";
	}
}
