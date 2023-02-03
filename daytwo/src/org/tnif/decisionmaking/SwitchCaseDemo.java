package org.tnif.decisionmaking;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Choice");
		System.out.println("Enter 1 for kesariya");
		System.out.println("Enter 2 for ved");
		System.out.println("Enter 3 for shayad");
		System.out.println("Enter 4 for Perfect");
		int choice = sc.nextInt();
		sc.close();

		// Switch case Example
		switch(choice) {
		case 1:
			System.out.println("Kesariya callertune is activated");
			break;
		case 2:
			System.out.println("ved callertune is activated");
			break;
		case 3:
			System.out.println("shayad callertune is activated");
			break;
		case 4:
			System.out.println("Perfect callertune is activated");
			break;
		default:
			System.out.println("Invalid Input");
		}
	}

}
