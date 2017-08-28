package edu.spring.mod3.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.spring.mod3.beans.User;
import edu.spring.mod3.service.LoginService;
import edu.spring.mod3.service.UserServiceImpl;

public class AspectTest {
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");
		System.out.println("*********** without interceptor begin ***********");
		UserServiceImpl userService = (UserServiceImpl)context.getBean("userServiceImpl");
		userService.addUser();
		System.out.println("*********** without interceptor end ***********\n\n\n");
		System.out.println("*********** with interceptor begin ***********");
		UserServiceImpl userServiceProxy = (UserServiceImpl)context.getBean("userProxy");
		userServiceProxy.addUser();
		System.out.println("*********** with interceptor end ***********");
		System.out.println("############### Begin Around Advisor #################");
		LoginService loginService = (LoginService)context.getBean("loginProxy");
		User u = new User();
		u.setUserName("dummy");
		loginService.login(u);
		System.out.println("############### After Around	 Advisor #################");
		System.out.println("$$$$$$$$$$$$$$$ Begin Exception Throws Advisor $$$$$$$$$$$$$$$$$");
		u.setPassword("23234");
		loginService.authenticate(u);
		System.out.println("$$$$$$$$$$$$$$$ After Exception Throws Advisor $$$$$$$$$$$$$$$$$");
		
	}
}