package com.arrays.coding;

import java.util.Scanner;

public class EfficientDuplicateArray {

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
		
		int res=duplicateElement(arr,n);

		
		System.out.println(res);

	}

	private static int duplicateElement(int[] arr, int n) {
		
		int res=1;
		int count=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]!=arr[res-1])
			{
				arr[res]=arr[i];
				res++;
			}
		}
		
		return res;
	}

}
