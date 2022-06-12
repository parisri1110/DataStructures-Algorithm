package com.arrays.coding;

import java.util.Scanner;

public class SecondLargest {

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
		
		int y = secondlagest(arr);
		
		System.out.println(y);

	}

	private static int secondlagest(int[] arr) {
		
		int largest = largestElement(arr);
		
		int res=-1;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=arr[largest])
			{
				if(res==-1)
				{
					res=i;
				}
				else
					if(arr[i]>arr[res])
					{
						res=i;
					}
			}
		}
		
		
		return res;
	}

	private static int largestElement(int arr[]) {

		int res = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[res]) {

				res = i;
			}
		}

		return res;

	}

}
