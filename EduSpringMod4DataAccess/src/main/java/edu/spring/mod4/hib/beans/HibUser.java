package edu.spring.mod4.hib.beans;

public class HibUser {
	protected String UserName;
	protected String FirstName;
	protected String LastName;
	public HibUser(){}
	public HibUser(String userName, String firstName, String lastName){
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setUserName(userName);
	}
	
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HibUser [UserName=");
		builder.append(UserName);
		builder.append(", FirstName=");
		builder.append(FirstName);
		builder.append(", LastName=");
		builder.append(LastName);
		builder.append("]");
		return builder.toString();
	}
}