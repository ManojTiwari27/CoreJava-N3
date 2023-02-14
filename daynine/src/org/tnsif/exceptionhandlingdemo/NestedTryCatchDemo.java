package org.tnsif.exceptionhandlingdemo;
import java.util.Scanner;

public class NestedTryCatchDemo {

	public static void main(String[] args) {
		System.out.println("Enter two values");
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		int arr[] = new int[] {1,2,3};
		try {
			int result = x/y;
			System.out.println(result);
			try {
				System.out.println(arr[3]);
			}
			catch(ArrayIndexOutOfBoundsException e1){
				System.out.println("Exception handled using catch"+e1);
				}	
		}
		catch(ArithmeticException e){
			System.out.println("Exception handled using catch"+e);
			try {
				System.out.println(arr[3]);
			}
			catch(ArrayIndexOutOfBoundsException e1){
				System.out.println("Exception handled using catch"+e1);
				}
			}
		

	}

}
