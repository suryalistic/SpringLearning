package com.spv.springmvc001.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ControllerAdvice
@EnableWebMvc
public class ExceptionController {
	Log logger = LogFactory.getLog(ExceptionHandler.class);
	@ExceptionHandler(value=Exception.class)
	public String handleException(HttpServletRequest request, Exception e){
		logger.error(request, e);
		return "error";
	}
}
