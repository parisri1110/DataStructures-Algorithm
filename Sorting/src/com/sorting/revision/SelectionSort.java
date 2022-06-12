package com.sorting.revision;

import java.util.Scanner;

public class SelectionSort {

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
		for(int i=0;i<n;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min])
				{
				min=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		
	}

}
