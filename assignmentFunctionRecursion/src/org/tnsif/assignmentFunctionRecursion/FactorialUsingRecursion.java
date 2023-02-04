package org.tnsif.assignmentFunctionRecursion;
import java.util.Scanner;
// Example on Factorial using Recursion 
public class FactorialUsingRecursion {
	// Function Definition
	static int factorial(int num1) {
		if(num1==1) {
			return num1;
		}
		return(num1*factorial(num1-1));
	}
	public static void main(String[] args) {
		System.out.println("Enter a number to check Factorial: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		// Function Call
		int result = factorial(num);
		System.out.println("Factorial of "+num+" is "+result);
		
	}

}
