package com.arrays.coding;

import java.util.Scanner;

public class ImmediateElement {

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
				arr[count]=arr[i];
				count++;
			}
			//System.out.println(arr[i]);
		}
		//System.out.println(arr[i]);
		int res=0;
		
		for(int i=0;i<count;i++)
		{
			if(arr[i]>arr[res])
			{
				res=i;
				//System.out.println(arr[i]);
			
			}
			System.out.println(arr[i]);
		}
		//System.out.println(arr[res]);
		
		
		
	}
	
}
