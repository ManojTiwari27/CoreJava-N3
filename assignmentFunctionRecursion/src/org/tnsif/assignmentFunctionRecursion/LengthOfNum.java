package org.tnsif.assignmentFunctionRecursion;
import java.util.Scanner;

public class LengthOfNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number:");
		int num = sc.nextInt();
		int count = 0;
		sc.close();
		while(num!=0) {
			num = num/10;
			count++;
		}
		System.out.print("Total Digits In a Number: "+count);


	}

}
