package com.hashing.coding.revision;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FreqElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("no of elements");
		
		
		int n = sc.nextInt();
		int count=0;

		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt()	;
					}
		
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for (int i : arr) {
			hm.put(i, hm.getOrDefault(i, 0)+1);
		}
		
		// to print frequencies
		/*
		 * for(Map.Entry<Integer, Integer> e:hm.entrySet()) {
		 * System.out.println(e.getKey() +" " +e.getValue()); }
		 */
		
		// to count non repeated elements
		for(Map.Entry<Integer, Integer> e:hm.entrySet())
		{
			if(e.getValue()==1)
			{
				count++;
			}
		}
		System.out.println(count);
		
		// to print non repeated element
		for(Map.Entry<Integer, Integer> e:hm.entrySet())
		{
			if(e.getValue()==1)
			{
				System.out.print(e.getKey());
			}
		}
	}

}
