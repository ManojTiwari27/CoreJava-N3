package org.tnsif.classandobject;

import java.util.Scanner;

public class CarDemo {

	public static void main(String[] args) {
		System.out.println("Enter Speed of car");
		Scanner sc= new Scanner(System.in);
		int speed = sc.nextInt();
		sc.close();
		Car c1 = new Car();
		//c1.speed=45;
		c1.display(speed);

	}

}
