package org.tnsif.intro;
import java.util.Scanner;
//TO demonstrate the example on user input
public class UserInputDemo {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter integer value ");
		int x = sc.nextInt();
		System.out.println("Enter float value ");
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
		System.out.println("The Value of x is "+x);
		System.out.println("The Value of y is "+y);
		System.out.println("The Value of ch is "+ch);
		System.out.println("The Value of name is "+name);
		//System.out.println("The Value of str is "+str);
		System.out.println("The Value of d is "+d);
		
	}

}
