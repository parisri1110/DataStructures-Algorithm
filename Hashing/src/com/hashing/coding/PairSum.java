package com.hashing.coding;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PairSum {

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
		
		int sum=-10;
		
		int res=findPair(arr, sum);
		System.out.println(res);
		
	}

	private static int findPair(int[] arr, int sum) {
		// TODO Auto-generated method stub
HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(hm.containsKey(sum-arr[i]))
			{
				System.out.printf("Pair found (%d, %d)" ,arr[hm.get(sum-arr[i])],arr[i]);
				return 1;
			}
			
			hm.put(arr[i], i);
		}
		//System.out.println("");
		return 0;

		
	}

}
