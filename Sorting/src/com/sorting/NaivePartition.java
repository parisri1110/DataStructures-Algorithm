package com.sorting;

import java.util.Scanner;

public class NaivePartition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of eleemnts");

		int n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int l = sc.nextInt();
		int h = sc.nextInt();
		int p = sc.nextInt();
		int res=sorting(arr, l, h, p);
		for (int x : arr)
			System.out.print(x + " ");
		System.out.println("res" + res);
	}

	private static int sorting(int[] arr, int l, int h, int p) {

		/*
		 * int[] temp=new int[h-l+1];int index=0; for(int i=l;i<=h;i++)
		 * if(arr[i]<=arr[p] && i!= p) { temp[index]=arr[i];index++; } temp[index++] =
		 * arr[p]; for(int i=l;i<=h;i++) if(arr[i]>arr[p]) { temp[index]=arr[i];index++;
		 * } for(int i=l;i<=h;i++) arr[i]=temp[i-l];
		 */

		int temp[] = new int[h - l + 1];
		int index = 0;

		for (int i = l; i <= h; i++) {
			if (arr[i] <arr[p]) {
				temp[index] = arr[i];
				index++;
			}
		}
		for (int i = l; i <= h; i++) {
			if (arr[i] == arr[p]) {
				temp[index] = arr[i];
				index++;
			}
		}

		int res = l + index - 1;
		for (int i = l; i <= h; i++) {
			if (arr[i] > arr[p]) {
				temp[index] = arr[i];
				index++;
			}
		}
		for (int i = l; i <= h; i++) {
			arr[i] = temp[i - l];
		}
		return res;

	}

}
