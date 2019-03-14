package com.security;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class CipherEncryption {

	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
		// TODO Auto-generated method stub
		KeyPairGenerator keyPairGenerator=KeyPairGenerator.getInstance("RSA");
		keyPairGenerator.initialize(2048);
		KeyPair keyPair=keyPairGenerator.genKeyPair();
		PublicKey publicKey=keyPair.getPublic();
		
		//create the Cipher object for encryption
		Cipher cipher=Cipher.getInstance("RSA/ECB/PKCS1Padding");
		cipher.init(Cipher.ENCRYPT_MODE, publicKey);
		String data="Welcome to Tutorialspoint";
		cipher.update(data.getBytes());
		byte[] encrytedData=cipher.doFinal();
		System.out.println(" data  ......."+data);
		System.out.println("Encrypted data using AES algorithm ......."+new String(encrytedData,"UTF-8"));
		
		//initilize the cipher object for decryption
		PrivateKey privateKey=keyPair.getPrivate();
		cipher.init(Cipher.DECRYPT_MODE, privateKey);
		byte[] decryptedData=cipher.doFinal(encrytedData);
		System.out.println(" Decrypted data .........."+new String(decryptedData));
		
		
	}

}
