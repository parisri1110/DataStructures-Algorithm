package com.leetcode.challenges;

import java.util.Scanner;

public class ClosestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of eleemnts");

		int n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("enter target element which is close to the number present in array");
		int x = sc.nextInt();
		int res = search(arr, x);
		System.out.println(res);

	}

	private static int search(int[] arr, int x) {
		
		int low=0;
		int high=arr.length-1;		
		if(x<arr[0])
		{
			return arr[0];
		}
		if(x>arr[arr.length-1])
		{
			return arr[arr.length-1];
		}
		
		while(low<=high)
		{
			int mid=(low+high)/2;
			
			if(x<arr[mid])
				high=mid-1;
			else 
				if(x>arr[mid])
					low=mid+1;
				else
					return arr[mid];
		}
		
		return (arr[low]-x)<(x-arr[high]) ? arr[low]:arr[high];
	}

}
