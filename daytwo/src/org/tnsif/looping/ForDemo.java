package org.tnsif.looping;
import java.util.Scanner;

// Example on for loop
public class ForDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How many values you want");
		int num = sc.nextInt();
		sc.close();
		// TO print 1 to n numbers
		for(int i=1;i<=num;i++) {
			System.out.println(i);
		}
		// TO print values in reverse order
		System.out.println("Reverse Order");
		for(int i=num;i>=1;i--) {
			System.out.println(i);
		}
	}

}
