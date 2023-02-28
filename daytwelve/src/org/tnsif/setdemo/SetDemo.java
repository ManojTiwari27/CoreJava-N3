package org.tnsif.setdemo;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
//Program to demonstrate difference between hashset and linked hashset

public class SetDemo {

	public static void main(String[] args) {
		Set<Object> obj =new HashSet<>();
		obj.add(1);
		obj.add("Manoj");
		obj.add(87.60);
		System.out.println("Set1 Elements are: "+obj);
		
		Set<Object> obj1 =new LinkedHashSet<>();
		obj1.add(2);
		obj1.add("Pratik");
		obj1.add(76.84);
		System.out.println("Set2 Elements are: "+obj1);
		

	}

}
