package org.tnsif.intro;

import java.util.Scanner;

//TO demostrate the example on user input
public class UserInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter integer value ");
		int x = sc.nextInt();
		System.out.println("Enter flaot value ");
		float y = sc.nextFloat();
		System.out.println("Enter a character ");
		char ch = sc.next().charAt(0);
		System.out.println("Enter a string ");
		String name = sc.next() ;
		//System.out.println("Enter string ");
		//String str = sc.nextLine();
		System.out.println("Enter double value ");
		double d = sc.nextDouble();
		sc.close();
		System.out.println("the Value of x is "+x);
		System.out.println("the Value of y is "+y);
		System.out.println("the Value of ch is "+ch);
		System.out.println("the Value of name is "+name);
		//System.out.println("the Value of str is "+str);
		System.out.println("the Value of d is "+d);
		
	}

}
