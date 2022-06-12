package com.recursion.coding;

import java.util.Scanner;

public class NaturalNtoOneRecursion {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		/*
		 * int arr[]=new int[n]; for (int i = 0; i < n; i++) { arr[i] = sc.nextInt();
		 * 
		 * } for (int i = 0; i < n; i++) { System.out.print(arr[i] + " "); }
		 */
		
		printNaturalNto1(n);

	}

	private static void printNaturalNto1(int n) {
		if(n==0)
			return;
		printNaturalNto1(n-1);
		System.out.println(n +" ");
		
		
	}

}
