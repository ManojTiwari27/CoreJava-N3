package org.tnsif.operators;
import java.util.Scanner;
public class OperatorDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of X & Y ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		
		// Arithmetic Operator
		System.out.println("Addition is "+(x+y));
		System.out.println("Substraction is "+(x-y));
		System.out.println("Multiplication is "+(x*y));
		System.out.println("Division is "+(x/y));
		System.out.println("Remainder is "+(x%y));
		
		
		// Relational Operator
	    System.out.println("Enter value of m & n ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		boolean res1=m>n;
		System.out.println("m>n result is " +res1);
		m*=n;// m=m*n
		System.out.println("m*=n is equal to "+m);
		
		// Logical Operator
		boolean res2 = (5==5) && (5>4);
		boolean res3 = (5==4) || (4<5);
		boolean res4 = !(5==4);
		System.out.println("(5==5) && (5>4) result is "+res2);
		System.out.println("(5==4)||(4<5) result is "+res3);
		System.out.println("!(5==4)"+res4);
		
		// Bitwise Operator
		int a = 12&5;
		int b = 12|5;
		int c = 12^5;
		System.out.println("bitwise and of 12 and 5 is "+a);
		System.out.println("bitwise or of 12 and 5 is "+b);
		System.out.println("bitwise Xor of 12 and 5 is "+c);
		
		// Ternary Operator
		String res5 = (13%2==0)?"Even":"odd";		
		System.out.println("13 is "+res5+" Number");
		
		// Increment and Decrement operator
		int p = x++;
		int q = --x;
		System.out.println("value of P and Q is "+p+" "+q);
		

	}

}
