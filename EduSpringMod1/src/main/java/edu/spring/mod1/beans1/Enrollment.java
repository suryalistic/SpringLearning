package edu.spring.mod1.beans1;

import java.io.Serializable;

public class Enrollment implements Serializable {
	private static final long serialVersionUID = 1L;
	protected Student student;
	protected Course course;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Enrollment [getStudent()=");
		builder.append(getStudent());
		builder.append(", getCourse()=");
		builder.append(getCourse());
		builder.append("]");
		return builder.toString();
	}
}