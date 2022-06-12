package com.arrays.coding.revision;

import java.util.Scanner;

public class ArraySorted {
public static void main(String[] args) {
	boolean y;
	Scanner sc = new Scanner(System.in);
	System.out.println("no of elements");

	int n=sc.nextInt();
	
	int arr[]=new int[n];
	
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	
	
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
	}

	y=sorting(arr);
	System.out.println(y);
}

private static boolean sorting(int[] arr) {
	// TODO Auto-generated method stub
	
	for(int i=1;i<arr.length;i++)
	{
		if(arr[i]<arr[i-1])
			return false;
	}
	return true;
}

}
