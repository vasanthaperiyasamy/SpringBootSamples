package com.javacomparator;

public class Person {

	Person(String name,int age,String dept){
		this.name=name;
		this.age=age;
		this.dept=dept;
	}
	
	private String name;
	private String dept;
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private int age;
	
	
	@Override
	public String toString() {
		
		return name +" | "+age + "  | "+dept   + "\n";
	}
}
