package org.tnsif.arraydemo;

import java.util.Scanner;

public class ArrayObjectDemo {

	public static void main(String[] args) {
		System.out.println("Enter how many elements you want in array");
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		Student arr[];
		arr = new Student[n];
		System.out.println("Enter rollno ,name and percentage of student");
		for(int i=0;i<n;i++) {
			arr[i] = new Student(sc.nextInt(),sc.next(),sc.nextFloat());
		}
		sc.close();
		for(int j=0;j<n;j++) {
			System.out.println(arr[j].getRollno()+" "+arr[j].getName()+" "+arr[j].getPercentage());
		}
	}

}
