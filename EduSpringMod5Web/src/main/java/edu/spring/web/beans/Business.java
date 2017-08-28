package edu.spring.web.beans;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Business {

	protected String businessId;
	protected String businessName;
	protected String ownerName;
//	@DateTimeFormat(pattern = "MM-dd-yyyy")
	protected String registeredDate;
	
	public String getBusinessId() {
		return businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getRegisteredDate() {
		return registeredDate;
	}
	public void setRegisteredDate(String registeredDate) {
		this.registeredDate = registeredDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Business [businessId=");
		builder.append(businessId);
		builder.append(", businessName=");
		builder.append(businessName);
		builder.append(", ownerName=");
		builder.append(ownerName);
		builder.append(", registeredDate=");
		builder.append(registeredDate);
		builder.append("]");
		return builder.toString();
	}
	
	
}
