package com.hashing.coding;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("no of elements");
		
		
		int n = sc.nextInt();

		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt()	;
					}
		HashSet<Integer> hs=new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			hs.add(arr[i]);
		}

		System.out.println(hs.size());
		
	}

}
