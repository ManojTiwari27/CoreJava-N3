package org.tnsif.exceptionhandlingdemo;

public class FinallyDemo {

	public static void main(String[] args) {
		
		try {
			//1. when you use system.exit method
			int arr[] = new int[] {1,2,3};
			//System.exit(0);
			System.out.println(arr[3]);
			
		}
		catch(Exception e) {
			System.out.println("Exception handled by catch"+e);
			//System.exit(0);
		}
		finally {
			//2.when finally block contains exception
			int z = 12/0;
			System.out.println("Finally block");
		}
		

	}

}
