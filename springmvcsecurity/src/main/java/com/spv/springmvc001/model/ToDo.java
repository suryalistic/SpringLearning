package com.spv.springmvc001.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Size;

public class ToDo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public ToDo(String id, String userName, String description, Date targetDate, boolean isDone) {
		super();
		this.id = id;
		this.userName = userName;
		this.description = description;
		this.targetDate = targetDate;
		this.isDone = isDone;
	}
	public ToDo() {
		super();
	}
	public String id;
	public String userName;
	@Size(min=5,message="Please enter atleast 5 characters")
	public String description;
	public Date targetDate;
	public boolean isDone;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}
	public boolean getIsDone() {
		return isDone;
	}
	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}
	
	@Override
	public String toString() {
		return String.format("ToDo [id=%s, userName=%s, description=%s, targetDate=%s, isDone=%s]", id, userName,
				description, targetDate, isDone);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (isDone ? 1231 : 1237);
		result = prime * result + ((targetDate == null) ? 0 : targetDate.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ToDo other = (ToDo) obj;
		
		if (id == null) {
			if (other.id != null){
				return false;
			}	
		} else if (!id.equals(other.id)){
			return false;
		}
		return true;
	}
}