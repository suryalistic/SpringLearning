package edu.spring.mod4.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.spring.mod4.dao.UserDao;

public class JdbcTemplateTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userDao = context.getBean("userDao",UserDao.class);
		userDao.getUserByUserName("surya");
		
		System.out.println("All Users>>"+userDao.getAllUsers());
		
		userDao.insertUser(null);
	}

}
