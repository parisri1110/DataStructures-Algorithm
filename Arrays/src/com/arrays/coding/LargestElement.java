package com.arrays.coding;

import java.util.Scanner;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

	private static int largestElement(int arr[] ) {
		
		int res=0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] >arr[res])
			{
			
				res=i;
			}
		}

		return arr[res];

	}

	}

