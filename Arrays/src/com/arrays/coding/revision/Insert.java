package com.arrays.coding.revision;

import java.util.Arrays;
import java.util.Scanner;

public class Insert {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("no of elements");
		int n = sc.nextInt();

		int arr[] = new int[n+1];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("Element to be inserted");
		int x = sc.nextInt();
 
		System.out.println("At what position");
		int pos=sc.nextInt();
		
		System.out.println("Capacity of an array");
		int cap=sc.nextInt();
		
		
		//System.out.println(n);
		
		arr=insert(arr, n, x,pos,cap);
		System.out.println("After inseting");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		//System.out.println(arr[n]);
		System.out.println(Arrays.toString(arr));

		
	}

	private static int[] insert(int[] arr, int n, int x, int pos, int cap) {
		// TODO Auto-generated method stub
		
		int index=pos-1;
		for(int i=n-1;i>=index;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[index]=x;
		return arr;
	}
	
	
}
