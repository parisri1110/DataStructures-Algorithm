package com.arrays.coding.revision;

import java.util.Scanner;

public class EffLargets {
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
	int x=largestElement(arr);
	System.out.println(x);

	}

	private static int largestElement(int[] arr) {
		// TODO Auto-generated method stub
		int res=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>arr[res])
			{
				res=i;
			}
		}
		return res;
	}

}
