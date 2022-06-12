package com.searching.binarysearch;

import java.util.Scanner;

public class BinaryIterative {

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
		int res = search(arr, x);
		System.out.println(res);

	}

	private static int search(int[] arr, int x) {
		int low=0;
		int high=arr.length-1;
		
		
while(low<=high)
{
	int mid=(low+high)/2;
	if(arr[mid]==x)
		return 1;
	else
		if(arr[mid]>x)
				high=mid-1;
		else
			low=mid+1;
				
	}
return -1;
		

	}

}
