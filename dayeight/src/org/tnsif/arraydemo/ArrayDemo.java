package org.tnsif.arraydemo;
import java.util.Arrays;
import java.util.Scanner;
// To demonstrate example on array using user input
public class ArrayDemo {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter how many value in array");
		int n = sc.nextInt();
		//Array Declaration
		int arr[] = new int[n];
		//TO Allocate value to an array
		System.out.println("Enter "+ n + " Values");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		System.out.println("Array Elements are:");
		for(int iter1:arr) {
			System.out.print(iter1+" ");
		}
		//To print the elements of an array
		/*for(int j=0;j<n;j++) {
			System.out.print(arr[j]+" ");
		}
		*/
		System.out.println();
		//TO sort an array element
		Arrays.sort(arr);
		
		System.out.println("Array in sorted order:");
		/*
		 for(int j=0;j<n;j++) {
			System.out.print(arr[j]+" ");
		}*/
		for(int iter:arr) {
			System.out.print(iter+" ");
		}
	}

}
