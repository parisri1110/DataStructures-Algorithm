package com.arrays.coding;

import java.util.Scanner;

public class TwoRotate {

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

	private static void moveElement(int[] arr,int d) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=d;i++)
		{
			leftRotate(arr);
		}
		
	}

	private static void leftRotate(int[] arr) {
		// TODO Auto-generated method stub
		int temp=arr[0];
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=temp;
	}

	/*
	 * private static void moveElement(int[] arr) { int count = 0; int t1=arr[0];
	 * int t2=arr[1]; int d=3; int temp=0;
	 * 
	 * 
	 * for(int i=0;i<d;i++) {
	 * 
	 * arr[temp]=arr[i]; temp++; } for(int i=0;i<arr.length;i++) { arr[i]=arr[i+d];
	 * //arr[arr.length-1]=arr[temp]; //System.out.println(arr[i]); }
	 * arr[arr.length-1]=arr[temp];
	 * 
	 * 
	 * for(int i=0;i<d;i++) { arr[temp]=arr[i]; temp++; }
	 * 
	 * for(int i=0;i<arr.length;i++) { arr[i]=arr[i+1]; arr[arr.length-1]=temp;
	 * 
	 * }
	 * 
	 * System.out.println("After rotation o"); for (int i = 0; i < arr.length; i++)
	 * { System.out.print(arr[i] + " "); }
	 * 
	 * 
	 * for (d=3; d < arr.length; d++) {
	 * 
	 * arr[d-3] = arr[d]; count++;
	 * 
	 * }
	 * 
	 * for (int j = count; j < arr.length; j++) { arr[count] = t1;
	 * //arr[count++]=temp++; arr[count+1]=t2; //count++; temp++; }
	 * 
	 * 
	 * 
	 * 
	 * }
	 */

}
