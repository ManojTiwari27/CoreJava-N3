package org.tnif.decisionmaking;
import java.util.Scanner;

public class NestedIfDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age and weight");
		int age = sc.nextInt();
		int weight = sc.nextInt();
		sc.close();
		// Nested if statement
		if(age>=12) {
			if(weight>=40) {
				if(weight<=120) {
					System.out.println("You are eligible for bunjee jumping");
				}
				else {
					System.out.println("Extra ropes will be added");
				}
			}
			else {
			System.out.println("You are not eligible for bunjee jumping");
			}
		}
		else {
			System.out.println("You are not eligible for bunjee jumping");
		}

	}

}
