package com.hashing.coding;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class HashingPair2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("EEnter no of elements");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt()	;
					
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		int sum=9;
		
		HashSet<Integer> hs=new HashSet<Integer>();
		
		/*
		 * for(int i=0;i<arr.length;i++) { ls.add(arr[i]); }
		 * 
		 * for (int i = 0; i < arr.length; i++) { if (sum - arr[i] != arr[i]) { if
		 * (ls.contains(sum - arr[i])) { System.out.println(1); break; } }
		 * 
		 * } System.out.println(0);
		 */
		
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			temp=sum-arr[i];
			
			if(hs.contains(temp) && temp>=0)
			{
				System.out.printf("Pair found (%d, %d)",temp,arr[i]);
				break;
			}
			hs.add(arr[i]);
		}
	//	System.out.println(0);
	
		//System.out.println("Pair not found");
	}

}
