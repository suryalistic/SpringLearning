package edu.spring.mod2.beans2;

import org.springframework.beans.factory.annotation.Value;

public class Studio {
	
	@Value(value="Test StudioName")
	protected String studioName;

	public String getStudioName() {
		return studioName;
	}

	public void setStudioName(String studioName) {
		this.studioName = studioName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Studio [studioName=");
		builder.append(studioName);
		builder.append("]");
		return builder.toString();
	}
	
	
}
