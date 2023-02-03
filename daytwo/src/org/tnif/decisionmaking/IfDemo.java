package org.tnif.decisionmaking;
import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of a and b ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		// Example on if Statement
		if(a==b) {
			System.out.println(a+" is equal to "+b);
		}
		System.out.println(a+" is not equal to "+b);
	}

}
