package com.leetcode.challenges;

import java.util.Scanner;

public class InsertElementSorted {

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
		 int lo=0;
	        int hi=arr.length-1;
	        
	        while(lo<=hi)
	        {
	            int mid=(lo+hi)/2;
	            if(arr[mid]==x)
	                return mid;
	            if(arr[mid]>x)
	                hi=mid-1;
	            else 
	                if(arr[mid]<x)
	                    lo=mid+1;
	            
	        }
	        return hi+1;
	}

}
