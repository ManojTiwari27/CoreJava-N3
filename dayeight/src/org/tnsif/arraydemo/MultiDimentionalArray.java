package org.tnsif.arraydemo;

import java.util.Scanner;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		System.out.println("Provide two values to decide size of an array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		sc.close();
		System.out.println("Array elements are:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(arr[i][j]+" ");
			}
		}
		System.out.println();
		System.out.println(arr[0][2]);

	}

}
