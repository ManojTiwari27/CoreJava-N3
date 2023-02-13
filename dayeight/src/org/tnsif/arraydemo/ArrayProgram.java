package org.tnsif.arraydemo;

public class ArrayProgram {

	public static void main(String[] args) {
		int arr[] = {11,31,54,67};
		int arr1[] = new int[5];
		arr1[0] = 5;
		arr1[1] = 45;
		arr1[2] = 55;
		arr1[3] = 65;
		arr1[4] = 75;
		System.out.println(arr[3]);
		System.out.println(arr1[2]);
		for(int i=0;i<5;i++) {
			System.out.println(arr1[i]);
		}

	}

}
