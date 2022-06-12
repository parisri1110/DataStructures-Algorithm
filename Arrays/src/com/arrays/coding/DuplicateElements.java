   package com.arrays.coding;

import java.util.Scanner;

public class DuplicateElements {

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
		
		int res=duplicateElement(arr,n);

		System.out.println("Array");
		for(int i=0;i<res;i++)
		
		System.out.println(res);
	}

	private static int duplicateElement(int[] arr,int n) {
		
		
		int temp[]=new int[n];
		
		temp[0]=arr[0];
		int res=1;
		
		for(int i=1;i<n;i++)
		{
			if(temp[res-1]!=arr[i])
			{
				temp[res]=arr[i];
				res++;
			}
		}
		
		for(int i=0;i<res;i++)
		{
			arr[i]=temp[i];
		}
		
		return res;
	}

}
