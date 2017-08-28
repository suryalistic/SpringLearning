package edu.spring.mod1.beans1;

import java.io.Serializable;
import java.util.List;

public class PreRequisites implements Serializable {
	private static final long serialVersionUID = 1L;
	protected List<Course> courses;

	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PreRequisites [getCourses()=");
		builder.append(getCourses());
		builder.append("]");
		return builder.toString();
	}
}