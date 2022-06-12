package com.arrays.coding;

import java.util.Scanner;

public class DeleteAndShift {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("no of elements");
		int n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("element to be deleted");
		int X = sc.nextInt();

		int res = 0;
		int count = 0;
		int i;
		for (i = X; i < arr.length-1; i++) {

			arr[i] = arr[i+1];
			

		}
		arr[arr.length - 1] = 0;
		/*
		 * for(int j=count;j<arr.length;j++) { arr[count]=arr[count+1];
		 * 
		 * 
		 * //arr[arr.length-1]=0; } arr[arr.length-1]=0;
		 */
		for (i = 0; i < arr.length-1; i++) {
			System.out.print(arr[i] + "");
		}

	}

}
