package com.arrays.coding;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
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
		
		int temp;
		
		int low=0;
		int high=arr.length-1;
		int mid=((low+high)/2);
		
		/*
		 * for(int i=low;i<mid;i++) { for(int j=high;j>=mid+1;j--) { if(low!=high) {
		 * temp=arr[low]; arr[low]=arr[high]; arr[high]=temp; } } }
		 */
		
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
