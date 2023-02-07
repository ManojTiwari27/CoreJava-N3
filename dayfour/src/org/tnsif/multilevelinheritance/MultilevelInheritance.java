package org.tnsif.multilevelinheritance;

import java.util.Scanner;

public class MultilevelInheritance {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Iphone i = new Iphone();
		Iphone i1 = new Iphone(123,"kitkat","oneslot");
		System.out.println(i1);

	}

}
