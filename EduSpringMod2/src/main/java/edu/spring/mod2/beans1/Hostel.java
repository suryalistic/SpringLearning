package edu.spring.mod2.beans1;

public class Hostel {
	protected String hostelName;

	public String getHostelName() {
		return hostelName;
	}

	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Hoster [hostelName=");
		builder.append(hostelName);
		builder.append("]");
		return builder.toString();
	}
	
	
}