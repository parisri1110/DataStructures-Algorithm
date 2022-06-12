package com.sorting;

import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of eleemnts");

		int n = sc.nextInt();
		int m=sc.nextInt();

		int a[] = new int[n];
		int b[] = new int[m];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}
		sorting(a,b,n,m);
		/*
		 * System.out.println("After completion"); for (int i = 0; i < arr.length; i++)
		 * { System.out.print(arr[i] + " "); }
		 */

	}

	private static void sorting(int[] a, int[] b, int n, int m) {
		
		int i=0,j=0;
		
		while(i<n && j<m)
		{
			if(a[i]<b[j])
			{
				System.out.print(a[i]+" ");
				i++;
			}
			else
			{
				System.out.print(b[j]+" ");
				j++;
			}
		}
		while(i<n)
		{
			System.out.print("1st array" +a[i]+ " ");
			i++;
		}
		while(j<m)
		{
			System.out.print(b[j]+ " ");
			j++;
		}
		
	}

	

}
