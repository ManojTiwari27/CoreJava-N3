package org.tnsif.exceptionhandlingdemo;
import java.util.Scanner;
// Program to demonstrate example on arithmetic exception
public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		System.out.println("Enter two values");
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		// Try block contains the exeption code
		try {
		int result = x/y;
		System.out.println(result);
		}
		//Catch block handles the exception thrown by try
		catch(Exception e){
			System.out.println("Exception handled using catch"+e);
		}
		finally {
			System.out.println("finally block");
		}
		

	}

}
