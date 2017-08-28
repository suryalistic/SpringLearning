package edu.spring.mod1.beans1;

import java.io.Serializable;
import java.util.Date;

public class Course implements Serializable {
	private static final long serialVersionUID = 1L;
	protected String courseName;
	protected Date startDate;
	protected Date finishDate;
	protected String institutionName;
	protected String instructorName;
	protected Double fee;
	
	public void initialize(){
		System.out.println("initialize of Course Bean");
	}
	
	public void destroy(){
		System.out.println("destroy of Course Bean");
	}
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getFinishDate() {
		return finishDate;
	}
	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}
	public String getInstitutionName() {
		return institutionName;
	}
	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}
	public String getInstructorName() {
		return instructorName;
	}
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	public Double getFee() {
		return fee;
	}
	public void setFee(Double fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Course [getCourseName()=");
		builder.append(getCourseName());
		builder.append(", getStartDate()=");
		builder.append(getStartDate());
		builder.append(", getFinishDate()=");
		builder.append(getFinishDate());
		builder.append(", getInstitutionName()=");
		builder.append(getInstitutionName());
		builder.append(", getInstructorName()=");
		builder.append(getInstructorName());
		builder.append(", getFee()=");
		builder.append(getFee());
		builder.append("]");
		return builder.toString();
	}
	
}
