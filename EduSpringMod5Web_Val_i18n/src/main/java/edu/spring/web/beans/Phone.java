package edu.spring.web.beans;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Phone {
	@NotBlank
	@Min(value=5,message="Minimum length of Name is 5 Characters")
	@Max(value=20,message="Maximum lenth of Name is 20 Characters")
	protected String modelName;
	
	@NotNull
	protected String modelMajorVersion;
	protected String modelMinorVersion;
	protected String modelYear;
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getModelMajorVersion() {
		return modelMajorVersion;
	}
	public void setModelMajorVersion(String modelMajorVersion) {
		this.modelMajorVersion = modelMajorVersion;
	}
	public String getModelMinorVersion() {
		return modelMinorVersion;
	}
	public void setModelMinorVersion(String modelMinorVersion) {
		this.modelMinorVersion = modelMinorVersion;
	}
	public String getModelYear() {
		return modelYear;
	}
	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Phone [modelName=");
		builder.append(modelName);
		builder.append(", modelMajorVersion=");
		builder.append(modelMajorVersion);
		builder.append(", modelMinorVersion=");
		builder.append(modelMinorVersion);
		builder.append(", modelYear=");
		builder.append(modelYear);
		builder.append("]");
		return builder.toString();
	}
}