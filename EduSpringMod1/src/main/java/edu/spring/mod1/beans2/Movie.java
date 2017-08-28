package edu.spring.mod1.beans2;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Movie implements InitializingBean, DisposableBean {

	protected String name;
	protected String year;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("This is after Props set method>>> alternative to init method in context");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("This is destroy method>>> alternative to destroy method in context");
	}
	
}
