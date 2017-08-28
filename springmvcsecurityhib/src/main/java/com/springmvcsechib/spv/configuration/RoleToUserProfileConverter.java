package com.springmvcsechib.spv.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.springmvcsechib.spv.model.UserProfile;
import com.springmvcsechib.spv.service.IUserProfileService;

//The main highlight of this configuration is RoleToUserProfileConverter. 
//It will take care of mapping the individual userProfile id’s on view to actual UserProfile Entities in database.
@Component
public class RoleToUserProfileConverter implements Converter<Object, UserProfile> {
	Logger logger = LoggerFactory.getLogger(RoleToUserProfileConverter.class);
	
	@Autowired
	IUserProfileService userProfileService;
	
	@Override
	public UserProfile convert(Object arg0) {
		Integer id = Integer.parseInt((String)arg0);
		UserProfile profile = userProfileService.findById(id);
		return profile;
	}
}