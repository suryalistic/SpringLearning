package com.springmvcsechib.spv.model;

public enum UserProfileType {
	USER("user"),
	DBA("dba"),
	Admin("admin");
	
	String userProfileType;
	private UserProfileType(String profType){
		this.userProfileType = profType;
	}
	public String getUserProfileType() {
		return userProfileType;
	}
	
}
