package com.arrays.coding;

import java.util.Scanner;

public class UpdateArray {

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
		
		System.out.println("index");
		int index=sc.nextInt();
		
		System.out.println("element");
		int element=sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			if(i==index)
			{
				arr[i]=element;
				//System.out.println(element);
			}
		}
		
		System.out.println("ipdated array");

		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
