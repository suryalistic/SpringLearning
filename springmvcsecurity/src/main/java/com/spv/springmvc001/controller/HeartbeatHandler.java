package com.spv.springmvc001.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HeartbeatHandler{
	@RequestMapping(value="/hello")
	@ResponseBody
	public String sayHello(){
		String currentTime = new SimpleDateFormat("YYYY-MM-dd:HH:mm:ss").format(new Date());
		return "Hello Surya. Current Time:"+currentTime;
	}
}
