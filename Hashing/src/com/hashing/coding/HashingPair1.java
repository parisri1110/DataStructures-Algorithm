package com.hashing.coding;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class HashingPair1 {

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
		int sum=14;
		
		//HashSet<Integer,Integer> hm=new HashMap<Integer,Integer>();
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			hs.add(arr[i]);
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(sum-arr[i]!=arr[i])
			{
				continue;}
			else {
				if(hs.contains(sum-arr[i])) {
					System.out.println(1);
				break;
				}
			}
		}
		System.out.println(0);
	}

}
