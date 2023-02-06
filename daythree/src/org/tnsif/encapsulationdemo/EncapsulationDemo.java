package org.tnsif.encapsulationdemo;
import java.util.Scanner;

public class EncapsulationDemo {

	public static void main(String[] args) {
		System.out.println("Enter a pin");
		Scanner sc = new Scanner(System.in);
		int pin = sc.nextInt();
		sc.close();
		HDFC h1 = new HDFC();
		h1.setPin(pin);
		System.out.println(h1.getPin());
		h1.accept();
	}

}
