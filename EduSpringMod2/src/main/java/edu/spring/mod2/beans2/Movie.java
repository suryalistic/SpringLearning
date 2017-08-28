package edu.spring.mod2.beans2;

import org.springframework.beans.factory.annotation.Value;

public class Movie {
	@Value(value = "TestMovieName1")
	protected String name;
	@Value(value="2012")
	protected String year;
	protected Studio studio;
	
	public Studio getStudio() {
		return studio;
	}
	public void setStudio(Studio studio) {
		this.studio = studio;
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
		builder.append("Movie [name=");
		builder.append(name);
		builder.append(", year=");
		builder.append(year);
		builder.append(", studio=");
		builder.append(studio);
		builder.append("]");
		return builder.toString();
	}
	
}
