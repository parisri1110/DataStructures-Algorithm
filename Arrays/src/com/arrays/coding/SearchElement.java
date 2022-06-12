package com.arrays.coding;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		int x = sc.nextInt();

		System.out.println(n);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(x);
		System.out.println(search(arr, n, x));

	}

	private static int search(int arr[], int n, int x) {
		for (int i = 0; i < n; i++) {
			if (arr[i] == x)
				return i;
		}

		return -1;

	}

}
