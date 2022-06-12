package com.recursion.coding;

import java.util.Scanner;

public class ArrayRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		
		  for (int i = 0; i < n; i++) { System.out.print(arr[i] + " "); }
		 
		
		
		printNaturalNto1(arr,n);
	}

	
	private static void printNaturalNto1(int arr[],int n) {
		int i=arr.length;
		if(n==0)
			return;
		printNaturalNto1(arr,n-1);
		System.out.println(arr[n-1] +" ");
		
		
		
	}
}
