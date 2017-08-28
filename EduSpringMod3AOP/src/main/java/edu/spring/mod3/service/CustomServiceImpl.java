package edu.spring.mod3.service;

import edu.spring.mod3.beans.Customer;

public class CustomServiceImpl {

	public boolean insertCustomer(Customer customer){
		System.out.println("CustomServiceImpl>>>insertCustomer>>"+customer);
		return true;
	}
}
