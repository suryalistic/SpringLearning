package edu.spring.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import edu.spring.web.beans.Business;
import edu.spring.web.service.BusinessService;

@Controller
public class BusinessController {
	@Autowired
	BusinessService businessService;
	
	@RequestMapping(method=RequestMethod.GET,value="/addBusinessHome")
	public ModelAndView addBusinessHome(){
		return new ModelAndView("AddBusiness", "addBusiness", new Business());
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/addNewBusiness")
	public String saveNewBusiness(@ModelAttribute("addBusiness")Business business, Model model){
		businessService.saveNewBusiness(business);
		model.addAttribute("message", "Saved Business "+business.getBusinessName());
		return "home";
	}
}