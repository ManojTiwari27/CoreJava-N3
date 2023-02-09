package org.tnsif.typecasting;
// Program to demonstrate example in typecasting
public class TypeCastingDemo {

	public static void main(String[] args) {
		//Implicit Typecasting
		int x = 50;
		float y = x;  
		System.out.println("The value of y is "+y);
		//Explicit Typecasting
		double d1 = 12.5d;
		long l1 = (long)d1;
		System.out.println("The value of l1 is "+l1);
		
	}

}
