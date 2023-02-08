package org.tnsif.superkeyword;
import java.util.Scanner;

public class SuperVariableDemo {

	public static void main(String[] args) {
		System.out.println("Enter name of flower");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		Rose r1 = new Rose();
		Rose r2 = new Rose(name);
		r1.setname("lotus");
		r1.display();
		r2.display();

	}

}
