package org.tnsif.polymorphismdemo;

import java.util.Scanner;

public class ConstructorOverloadingExecutor {

	public static void main(String[] args) {
		System.out.println("Enter Speed and color of car");
		Scanner sc = new Scanner(System.in);
		int speed = sc.nextInt();
		String color = sc.next();
		sc.close();
		HondaCity h1 = new HondaCity();
		HondaCity h2 = new HondaCity(speed,color);

	}

}
