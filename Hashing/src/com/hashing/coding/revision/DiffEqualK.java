package com.hashing.coding.revision;

import java.util.HashSet;
import java.util.Scanner;

public class DiffEqualK {

	public static void main(String[] args) {
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
		int k=2;

		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			hs.add(arr[i]);
		}
		
		/*
		 * for(int i=0;i<arr.length;i++) { if(k-arr[i]!=arr[i]) { continue; } else
		 * if(hs.contains(k-arr[i])) { System.out.println("Pair Found: (" + arr[i] +
		 * ", " + + (k +arr[i]) + ")"); } }
		 */
		
		for(int i=0;i<arr.length;i++)
		{
			if(hs.contains(arr[i]-k))
			{
				 System.out.println("(" + arr[i] + ", " + (arr[i] - k) + ")");
			}
			if(hs.contains(arr[i]+k))
			{
				 System.out.println("(" + arr[i] + ", " + (arr[i] +k) + ")");
			}
			hs.add(arr[i]);
		}
	//	System.out.println(hs);
	}

}
