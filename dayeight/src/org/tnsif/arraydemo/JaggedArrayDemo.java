package org.tnsif.arraydemo;

import java.util.Scanner;

public class JaggedArrayDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[2][];
		arr[0] = new int[3];
		arr[1] = new int[2];
		System.out.println("Enter Array Elments:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		sc.close();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
		}
		System.out.println();
		System.out.println(arr[0][2]);
		System.out.println(arr[1][0]);




	}

}
