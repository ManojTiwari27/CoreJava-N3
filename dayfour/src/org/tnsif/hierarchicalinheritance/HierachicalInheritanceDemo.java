package org.tnsif.hierarchicalinheritance;

import java.util.Scanner;

public class HierachicalInheritanceDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the type and version");
		String type=sc.nextLine();
		int version=sc.nextInt();
		int version1=sc.nextInt();
		sc.close();
		SnowCone s1=new SnowCone(type,version); 
		s1.setType(type);
		s1.setVersion(version);
		
		Tiramisu t=new Tiramisu(type,version1);
		t.setType(type);
		t.setVersion(version1);
		
		System.out.println(s1);
		System.out.println(t);

	}

}