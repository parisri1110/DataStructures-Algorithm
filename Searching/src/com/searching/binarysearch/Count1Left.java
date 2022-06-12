package com.searching.binarysearch;

import java.util.Scanner;

public class Count1Left {

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
			int mid=(high+low)/2;
			if(arr[mid]<1)
				high=mid-1;
			else
				if(arr[mid]>1)
					low=mid+1;
				else
					if(mid==n-1 ||arr[mid+1]!=arr[mid])
						return mid+1;
					else
						low= mid+1;
		}
		return 0;
	}

}
