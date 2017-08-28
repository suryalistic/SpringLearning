package edu.spring.mod2.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.spring.mod2.beans3.Team;

public class Mod2Test3 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
		Team team = (Team)context.getBean("team");
		System.out.println("team>>>"+team);
		System.out.println("Sport>>"+team.getSport().getOriginCountry());
	}

}
