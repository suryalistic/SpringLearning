package edu.spring.mod2.beans1;


public class Student{
	protected String name;
	protected String year;
	protected Hostel hostel;
	
	public Hostel getHostel() {
		return hostel;
	}
	public void setHostel(Hostel hostel) {
		this.hostel = hostel;
	}
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
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [name=");
		builder.append(name);
		builder.append(", year=");
		builder.append(year);
		builder.append(", hostel=");
		builder.append(hostel);
		builder.append("]");
		return builder.toString();
	}
	
}