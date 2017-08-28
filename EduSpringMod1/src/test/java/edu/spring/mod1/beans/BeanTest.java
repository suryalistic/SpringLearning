package edu.spring.mod1.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.spring.mod1.beans1.Course;
import edu.spring.mod1.beans1.Enrollment;
import edu.spring.mod1.beans1.Student;

public class BeanTest {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("Context>>"+context);
		Student student = (Student)context.getBean("student");
		Course course = (Course)context.getBean("course");
		Enrollment en = (Enrollment)context.getBean("enrollment");
		System.out.println("Student>>"+student);
		System.out.println("Course>>"+course);
		System.out.println("enrollment>>"+en);
		System.out.println("######### Begin shutdown of context");
		((AbstractXmlApplicationContext)context).registerShutdownHook();
	}
}