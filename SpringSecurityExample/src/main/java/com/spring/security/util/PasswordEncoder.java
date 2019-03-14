package com.spring.security.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {

	
	public static void main(String args[]) {
		BCryptPasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
		String encodedPassword=passwordEncoder.encode("abc123");
		System.out.println(" Encoded Password is :"+encodedPassword);
		
	}
}
