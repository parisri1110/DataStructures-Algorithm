package com.arrays.coding.questions;

import java.util.Scanner;

public class CyclicRotate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("no of elements");
		int n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}

		System.out.println("enter value of d");
		int d =sc.nextInt();
		
		moveElement(arr,d);
		
		  System.out.println("Enter value o");
		  for (int i = 0; i < arr.length; i++) {
		  System.out.print(arr[i] + " "); }
	}

	private static void moveElement(int[] arr, int d) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<d;i++)
		{
			cyclerotate(arr);
		}
		
	}

	private static void cyclerotate(int[] arr) {


		int temp=arr[arr.length-1];
		int i;
		for( i=arr.length-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[i]=temp;
		
	}

}
