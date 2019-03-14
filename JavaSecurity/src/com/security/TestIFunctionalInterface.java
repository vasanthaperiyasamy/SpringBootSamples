package com.security;

public class TestIFunctionalInterface{

public static void main(String args[]) {
	

	IFunctionalInterface functionalInterface=(param1,param2)->System.out.println(" print param1 "+param1+"  print param2"+param2);
	functionalInterface.print("hi","hello");
	

}
}