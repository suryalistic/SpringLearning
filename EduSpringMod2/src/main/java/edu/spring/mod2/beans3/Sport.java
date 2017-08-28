package edu.spring.mod2.beans3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Sport {
	@Value(value="Cricket")
	protected String sportName;
	@Value(value="DummyCountry")
	protected String originCountry;
	
	public String getSportName() {
		return sportName;
	}
	public void setSportName(String sportName) {
		this.sportName = sportName;
	}
	public String getOriginCountry() {
		return originCountry;
	}
	public void setOriginCountry(String originCountry) {
		this.originCountry = originCountry;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Sport [sportName=");
		builder.append(sportName);
		builder.append(", originCountry=");
		builder.append(originCountry);
		builder.append("]");
		return builder.toString();
	}
}