package com.javacomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class TestCustomComparater {
	
	public static void main(String args[]) {
		
		Person p1=new Person("Ajay",23,"EEE");
		Person p2=new Person("Jovitha",35,"Agri");
		Person p3=new Person("Joshika",6,"EEE");
		Person p4=new Person("Ajay",20,"Agri");
		Person p5=new Person("Ajay",18,"CS");
		
		List list=new ArrayList();
		list.add(p5);
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
	
		String array[]= {"dept","name"};
		
		//Collections.sort(list, new CustomComparator(array));
		Collections.sort(list, Comparator.comparing(Person::getName).thenComparing(Person::getAge).thenComparing(Person::getDept));
		System.out.println("list  by name \n " +list);
		
		
		Collections.sort(list, Comparator.comparing(Person::getDept));
		System.out.println("list  by dept \n " +list);
		
		Collections.sort(list, Comparator.comparing(Person::getAge));
		System.out.println("list  by age \n " +list);
	
	}

}