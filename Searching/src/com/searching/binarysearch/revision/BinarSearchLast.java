package com.searching.binarysearch.revision;

import java.util.Scanner;

public class BinarSearchLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of eleemnts");

		int n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("enter element to be searched");
		int x = sc.nextInt();
		int res = search(arr,n, x);
		System.out.println(res);

	}

	private static int search(int[] arr, int n, int x) {
		// TODO Auto-generated method stub
		int low=0;
		int high=n-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]>x)
			{
				high=mid-1;
			}
			else
				if(arr[mid]<x)
			{
				low=mid+1;
			}
			else
				if(mid==n-1 || arr[mid]!=arr[mid-1])
				return mid;
				else
					low=mid+1;
		}
		
		return -1;
	}

}
