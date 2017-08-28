package edu.spring.web.dao;

import org.springframework.stereotype.Repository;

import edu.spring.web.beans.Business;

@Repository
public class BusinessDao {

	public String saveNewBusiness(Business business){
		System.out.println("saving business>>"+business);
		return "Sucess";
	}
}