package org.tnsif.assignmentFunctionRecursion;
import java.util.Scanner;
// To demonstrate an example of Factorial of a number using function
public class FactorialUsingFunction {
	// Function Definition
	static int factorial(int num1) {
		int fact = 1;
		for(int i=1;i<=num1;i++) {
			fact = fact*i;
		}
		return(fact);
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
