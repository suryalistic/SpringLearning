package edu.spring.mod3.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.spring.mod3.service.CustomServiceImpl;

public class AspectjAopTest {
	public static void main(String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAspectj.xml");
		CustomServiceImpl custService = (CustomServiceImpl)context.getBean("customerService");
		System.out.println("calling the customer service in AspectjAopTest"+custService.insertCustomer(null));
	}
}
