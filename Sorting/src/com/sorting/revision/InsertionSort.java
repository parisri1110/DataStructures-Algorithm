package com.sorting.revision;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of eleemnts");

		int n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sorting(arr,n);
		System.out.println("After completion");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static void sorting(int[] arr, int n) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<n;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0 && key<arr[j])
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		
	}

}
