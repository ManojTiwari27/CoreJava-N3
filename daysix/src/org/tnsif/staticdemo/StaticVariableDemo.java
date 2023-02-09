package org.tnsif.staticdemo;
class main{
	static int num = 11;
}

public class StaticVariableDemo {
	static int n=10;
	public static void main(String[] args) {
		n=4;
		System.out.println("value of n is "+n);
		n=8;
		System.out.println("value of n is "+n);
		// We can access Static Variable without creating object of a class
		System.out.println("Staic variable "+main.num);
		

	}

}