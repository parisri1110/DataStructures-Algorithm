package com.leetcode.challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContainsDuplicate {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("no of elements");
		int n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			int key=arr[i];
			hm.put(key, hm.getOrDefault(key, 0)+1);
		}
		int count=0;
		for(Map.Entry<Integer, Integer> e:hm.entrySet())
		{
			//System.out.println(e.getKey() +" " + e.getValue());
			
			if(e.getValue()>=2)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
