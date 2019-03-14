package com.spring.security.service;

import java.util.List;

import com.spring.security.entity.UserProfile;

public interface UserProfileService {
	 UserProfile findById(int id);
	 
	    UserProfile findByType(String type);
	     
	    List<UserProfile> findAll();
}
