package edu.spring.mod2.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.spring.mod2.beans1.Student;

public class Mod2Test1 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = (Student)context.getBean("student");
		System.out.println("######### student>>>"+student);
		System.out.println("hostel>>>"+student.getHostel());
	}
}