package com.searching.binarysearch;

import java.util.Scanner;

public class Count1 {

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
		int res = count(arr,n);
		System.out.println(res);

	}

	private static int count(int[] arr, int n) {
		int low=0;
		int high=n-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==0)
				low=mid+1;
			else
				if(mid==0 || arr[mid]!=arr[mid-1])
					return (n-mid);
				else
					high=mid-1;
		}
		return 0;
	}

}
