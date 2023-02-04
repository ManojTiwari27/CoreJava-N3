package org.tnsif.assignmentFunctionRecursion;
import java.util.Scanner;
// Program to print fibonacci series upto n numbers  
public class FibbonacciSeriesUsingRecursion {
	// Function Definition
	static int fibonacciRecursion(int num){
		if(num == 0){
			return 0;
		}
		if(num == 1 || num == 2){
				return 1;
			}
		return fibonacciRecursion(num-2) + fibonacciRecursion(num-1);
		}
	public static void main(String[] args) {
		System.out.print("Enter a number where you want to stop fibonacci sereis: ");
		Scanner sc = new Scanner(System.in);
		int last = sc.nextInt();
		sc.close();
		System.out.print("Fibonacci Series of "+last+" numbers: ");
		for(int i = 0; i < last; i++){
			// Function Call
				System.out.print(fibonacciRecursion(i) +" ");
			}

	}

}
