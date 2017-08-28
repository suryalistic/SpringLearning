package edu.spring.mod2.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.spring.mod2.beans2.Movie;

public class Mod2Test2 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
		Movie movie = (Movie)context.getBean("movie");
		System.out.println("Movie>>"+movie);
		System.out.println("Studio from Movie>>"+movie.getStudio());
	}
}
