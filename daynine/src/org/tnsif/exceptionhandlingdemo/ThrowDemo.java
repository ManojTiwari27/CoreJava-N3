package org.tnsif.exceptionhandlingdemo;
// Program to demonstrate example on throw and throws
public class ThrowDemo {
	// Throws is used to declare an Exception
	public static void donate(int age , int weight) throws Exception{
		if(age>18 && weight>50) {
			System.out.println("Eligible to donate blood");
		}
		else {
			throw new Exception("Not Eligible");
		}
		
	}

	public static void main(String[] args) {
		try {
			donate(19,54);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
