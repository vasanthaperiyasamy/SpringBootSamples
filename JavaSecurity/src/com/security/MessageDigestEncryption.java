package com.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MessageDigestEncryption {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		// TODO Auto-generated method stub
		MessageDigest digest=MessageDigest.getInstance("MD5");
		String data="Vasantha";
		//prints the algorithm used 
		System.out.println(digest.getAlgorithm());
		digest.update(data.getBytes());
		
		
		//getting back the digest
		byte[] passBack=digest.digest();
		
		StringBuffer buffer=new StringBuffer();
		//reading the bytes and formating as hexadecimal
		for(byte bytes:passBack) {
			//System.out.println(" byte Array :"+bytes);
			buffer.append(String.format("%2x", bytes));
		}
		System.out.println(" Actual Data  :"+data);
		System.out.println(" Converted Data ..."+buffer.toString());
	}

}
