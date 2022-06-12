package com.searching.binarysearch;

import java.util.Scanner;

public class BinaryRecursive {

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

		int low = 0;
		int high = arr.length - 1;
		int res = search(arr, low, high, x);
		System.out.println(res);

	}

	private static int search(int[] arr, int low, int high, int x) {

		if (low > high)

			return -1;

		int mid = (low + high) / 2;
		if (arr[mid] == x)
			return mid;
		else if (arr[mid] > x)
			return search(arr, low, mid - 1, x);
		else
			return search(arr, mid + 1, high, x);

	}

}
