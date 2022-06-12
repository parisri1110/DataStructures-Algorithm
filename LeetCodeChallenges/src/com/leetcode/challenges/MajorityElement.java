package com.leetcode.challenges;

import java.util.Scanner;

public class MajorityElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of eleemnts");

		int n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int count=0;
		int res = majorityElement(arr,n);
		System.out.println(res);

	}

	private static int majorityElement(int[] arr, int n) {
		int count=1;
		int max=0;
		for(int i=1; i<arr.length-1;i++)
		{
			if(arr[max]==arr[i]) {
			count++;
			}
			else 
			{	count--;
			}
			if(count==0)
			{
				count=1;
				max=i;
			}
		}
		int val=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==arr[max])
				val++;
		}
		if(val>n/2)
			return arr[max];
		else
		   return -1;
	}

}
