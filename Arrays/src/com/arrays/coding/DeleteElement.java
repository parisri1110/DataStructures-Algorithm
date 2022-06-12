package com.arrays.coding;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {

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

		System.out.println("Element to be deleted");
		int x = sc.nextInt();

		int k = arr.length;

		k = delete(arr, n, x);
		System.out.println("After deleting");
		for (int i = 0; i < k; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static int delete(int arr[], int n, int x) {

		int i, count = 0;

		for (i = 0; i < n; i++) {
			if (arr[i] == x) {
				for (int j = i; j < n - 1; j++) {
					arr[j] = arr[j + 1];
				}
				count++;
				break;
			}
		}

		if (count == 0) {
			return n;
		} else {
			return n - 1;
		}

	}

}
