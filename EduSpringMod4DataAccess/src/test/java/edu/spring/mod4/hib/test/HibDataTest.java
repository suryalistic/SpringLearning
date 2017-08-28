package edu.spring.mod4.hib.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import edu.spring.mod4.hib.beans.HibUser;
import edu.spring.mod4.hib.dao.HibUserDao;

public class HibDataTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("hibApplicationContext.xml");
		HibUserDao uDao = context.getBean("hibUserDao",HibUserDao.class);
		HibUser u = new HibUser("duminyUserName4@User","DuminyFirstName3","DuminyLastName3");
		uDao.insertUser(u);	
		List<HibUser> users = uDao.getAllUsers();
		System.out.println("users>>>"+users);
	}
}
