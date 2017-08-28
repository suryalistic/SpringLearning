package edu.spring.web.controller;

import java.text.DateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.spring.web.beans.Phone;

@Controller
public class PhoneController {
	
	@RequestMapping(method=RequestMethod.GET,value="/addphoneModel")
	public ModelAndView addPhone(){
		return new ModelAndView("addPhone", "phoneObj", new Phone());
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/phoneModel")
	public String submitAddPhoneModel(@Valid @ModelAttribute("phoneObj") Phone phone,BindingResult result, Model model){
		System.out.println("phone>>>"+phone);
		if(result.hasErrors()){
			StringBuilder str = new StringBuilder("errors:");
			for(ObjectError oe: result.getAllErrors()){
				str.append(oe.getDefaultMessage());
			}
			model.addAttribute("message",str.toString());
		}else{
			model.addAttribute("message", "Phone recorded");
		}
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		return "home";
	}
}