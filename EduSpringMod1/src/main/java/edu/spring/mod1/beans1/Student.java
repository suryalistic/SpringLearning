package edu.spring.mod1.beans1;

import java.io.Serializable;

public class Student implements Serializable {
	private static final long serialVersionUID = 1L;
	protected String fname;
	protected String lname;
	protected String age;
	protected String location;
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [getFname()=");
		builder.append(getFname());
		builder.append(", getLname()=");
		builder.append(getLname());
		builder.append(", getAge()=");
		builder.append(getAge());
		builder.append(", getLocation()=");
		builder.append(getLocation());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}