package com.arrays.coding;

import java.util.Scanner;

public class FindSortedArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		boolean y;
		System.out.println("no of elements");
		int n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

		y=sorting(arr);
		System.out.println(y);
		
	}

	private static boolean sorting(int[] arr) {
		
		for(int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					return false;
				}
			}
			
		}
		return true;
		
		
	}

}
