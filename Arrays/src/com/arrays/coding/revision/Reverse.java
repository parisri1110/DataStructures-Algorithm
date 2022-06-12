package com.arrays.coding.revision;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("no of elements");
		int n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}

		reverseArray(arr);
		
		System.out.println("After completion");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static void reverseArray(int[] arr) {
		// TODO Auto-generated method stub
		int temp=0;
		int low=0;
		int high=arr.length-1;
		
		
		while(low<high)
		{
			temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
		
	}

}
