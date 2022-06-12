package com.arrays.coding;

import java.util.Scanner;

public class EfficientSecondLargest {

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
		
		int y = secondlargest(arr);
		
		System.out.println(y);

	}

	private static int secondlargest(int[] arr) {
		
		
		int res=-1;
		int largest=0;
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>arr[largest])
			{
				res=largest;
				largest=i;	
			}
			else if(arr[i]!=arr[largest])
			{
				if(arr[i]>arr[res] || res==-1)
				{
					res=i;
				}
			}
			
		}
		
		return res;
	}

}
