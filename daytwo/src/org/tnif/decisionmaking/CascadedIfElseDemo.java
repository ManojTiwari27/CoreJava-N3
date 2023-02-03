package org.tnif.decisionmaking;
import java.util.Scanner;

public class CascadedIfElseDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value of a, b and c");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		// Example on cascaded if-else Statement
		if(a>b && a>c) {
			System.out.println(a+" is Greater");
		}
		else if(b>a && b>c){
			System.out.println(b+" is Greater");
		}
		else {
			System.out.println(+c+" is Greater");
		}
	}

}
