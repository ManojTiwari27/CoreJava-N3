package org.tnsif.instanceofdemo;

import java.util.Scanner;

public class InstanceOfDemo {

	public static void main(String[] args) {
		System.out.println("Enter name, address and age ");
		Scanner sc = new Scanner(System.in);
		String name =sc.nextLine();
		String address =sc.nextLine();
		int age = sc.nextInt();
		
		Child c1= new Child();
		Child c2= new Child(name,address,age);
		c1.setName(name);
		c1.setAddress(address);
		c1.setAge(age);
		System.out.println(c1);
		System.out.println(c1 instanceof Person);
		System.out.println(c1 instanceof Child);

	}

}
