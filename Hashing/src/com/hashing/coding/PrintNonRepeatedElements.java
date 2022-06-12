package com.hashing.coding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrintNonRepeatedElements {

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
		
		ArrayList<Integer> ls=new ArrayList<Integer>();
		
		
		
		/*
		 * int temp[]=new int[n]; temp[0]=arr[0];
		 */
		int count=0;
		/*
		 * for(int i=1;i<arr.length;i++) { if(arr[i]!=arr[count-1]) { arr[count]=arr[i];
		 * count++;
		 * 
		 * } } // System.out.println(count);
		 * 
		 * 
		 * for(int i=count;i<arr.length;i++) { System.out.println(arr[i]); }
		 */
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for (int i : arr) {
			hm.put(i, hm.getOrDefault(i, 0)+1);
		}
		/*
		 * for(Map.Entry<Integer, Integer> entry :hm.entrySet()) {
		 * if(entry.getValue()==1) { ls.add(entry.getKey()); } } System.out.println(ls);
		 */
		
		for(int i=0;i<arr.length;i++)
		{
			if(hm.get(arr[i])==1)
			{
				ls.add(arr[i]);
			}
		}
		System.out.println(ls);
	}

}
