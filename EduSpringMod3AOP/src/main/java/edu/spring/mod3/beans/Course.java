package edu.spring.mod3.beans;

public class Course {
	protected String courseName;
	protected String courseId;
	protected Integer price;
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Course [courseName=");
		builder.append(courseName);
		builder.append(", courseId=");
		builder.append(courseId);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}
}