package edu.spring.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.spring.web.beans.Business;
import edu.spring.web.dao.BusinessDao;

@Service
public class BusinessService {
	@Autowired
	BusinessDao businessDao;
	public String saveNewBusiness(Business business){
		return businessDao.saveNewBusiness(business);
	}
}