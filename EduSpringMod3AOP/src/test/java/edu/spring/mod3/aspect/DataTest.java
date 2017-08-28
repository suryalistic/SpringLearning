package edu.spring.mod3.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.spring.mod3.ds.CourseDAO;

public class DataTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextDs.xml");
		CourseDAO cdao = context.getBean("courseDao",CourseDAO.class);
		cdao.insertCourse(null);
	}

}
