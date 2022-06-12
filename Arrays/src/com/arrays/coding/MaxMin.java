package com.arrays.coding;

import java.util.Scanner;

public class MaxMin {

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
		System.out.println();
		int res=max(arr,n);
		int r=min(arr,n);
System.out.println(res);
System.out.println(r);

	}

	private static int min(int[] arr, int n) {
		int min=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<arr[min])
				min=i;
		}
		return arr[min];
	}

	private static int max(int[] arr, int n) {
		// TODO Auto-generated method stub
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>arr[max])
				max=i;
		}
		return arr[max];
		
		// TODO Auto-generated method stub
		
	}

}
