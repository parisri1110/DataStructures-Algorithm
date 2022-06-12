package com.arrays.coding;

import java.util.Scanner;

public class LeftRotate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("no of elements");
		int n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}

		leftRotate(arr);
		
		System.out.println("After completion");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}


	}

	private static void leftRotate(int[] arr) {
		
		int temp=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			arr[i-1]=arr[i];
			
		}
		
		arr[arr.length-1]=temp;
	}

}
