package com.arrays.coding;

import java.util.Scanner;

public class CountSmaller {

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
		
		System.out.println("element");
		int X=sc.nextInt();
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			//int count=0;
			if(arr[i]<X)
			{
				count++;
			}
			
		}
		System.out.println(count);
		
		
	}

}
