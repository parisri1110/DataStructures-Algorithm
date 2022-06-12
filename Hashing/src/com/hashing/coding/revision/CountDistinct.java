package com.hashing.coding.revision;

import java.util.HashSet;
import java.util.Scanner;

public class CountDistinct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("no of elements");
		
		
		int n = sc.nextInt();

		int arr[] = new int[n];
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<n;i++)
		{
			hs.add(arr[i]);
		}
		System.out.println(hs.size());

	}

}
