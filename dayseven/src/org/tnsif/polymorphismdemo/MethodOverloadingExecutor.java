package org.tnsif.polymorphismdemo;

import java.util.Scanner;

public class MethodOverloadingExecutor {

	public static void main(String[] args) {
		System.out.println("Enter resolution and slottype ");
		Scanner sc  = new Scanner(System.in);
		int resolution = sc.nextInt();
		String slottype = sc.next();
		sc.close();
		
		Smartphone s = new Smartphone();
		s.setResolution(resolution);
		s.display(resolution);
		s.setSlottype(slottype);
		s.display(resolution, slottype);
		
		Multiplication m = new Multiplication();
		System.out.println(m.mul(21, 9));
		System.out.println(m.mul(5.0f, 8));
		

	}

}
