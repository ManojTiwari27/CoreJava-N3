package org.tnsif.looping;
import java.util.Scanner;
public class WhileDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How many values you want");
		int num = sc.nextInt();
		sc.close();
		int i=0;
		int j=num;
		while(i<=num) {
			System.out.println(i);
			i++;
		}
		System.out.println("Reverse Order");
		while(j>=1) {
			System.out.println(j);
			j--;
		}
	}

}
