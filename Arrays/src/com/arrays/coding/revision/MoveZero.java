package com.arrays.coding.revision;

import java.util.Scanner;

public class MoveZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("no of elements");
		int n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}

		moveElement(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}


	}

	private static void moveElement(int[] arr) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[count]=arr[i];
				count++;
			}
		}
		
		for(int i=count;i<arr.length;i++)
		{
			arr[count]=0;
			count++;
		}
		
	}

}
