package com.hashing.coding;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class CountNonRepeated {

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
		
		//HashSet<Integer> hs=new HashSet<Integer>();
		boolean flag=false;
		int count=0;
		
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for (int i : arr) {
			hm.put(i, hm.getOrDefault(i, 0)+1);
		}
		for(Map.Entry<Integer, Integer> entry :hm.entrySet())
		{
			if(entry.getValue()==1)
			{
				count++;
			}
		}
		System.out.println(count);
		
		
		
			//System.out.println(hs.size());

	}

}
