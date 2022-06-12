package com.leetcode.challenges;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of eleemnts");

		int n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("enter element to be searched");
		int x = sc.nextInt();
		int res =  searchfirst(arr, x);
		int res1=searchlast(arr,x);
		System.out.print(res+" "+res1);
	//	System.out.println(res1);
	}

	private static int searchlast(int[] arr, int x) {
		int low=0;
		int high=arr.length-1;
		int n=arr.length-1;
		int res=-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]<x)
			{
				low=mid+1;
			}
			else
				if(arr[mid]>x)
				{
					high=mid-1;
				}
				else 
					if(mid==n-1 || arr[mid]!=arr[mid-1])
						return mid;
					else
						low=mid+1;
		}
		return res;
	}

	private static int searchfirst(int[] arr, int x) {
		int low=0;
		int high=arr.length-1;
		int res=-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]<x)
			{
				low=mid+1;
			}
			else
				if(arr[mid]>x)
				{
					high=mid-1;
				}
				else 
					if(mid==0 || arr[mid]!=arr[mid-1])
						return mid;
					else
						high=mid-1;
		}
		return res;
	}

}
