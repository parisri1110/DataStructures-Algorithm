package com.leetcode.challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityElementVootingAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		
		int answer=0;
		int max=0;
		for(Map.Entry<Integer, Integer> e:hm.entrySet())
		{
			int key=e.getKey();
			int val=e.getValue();
			if(val>max)
			{
				max=val;
				answer=key;
			}
			else
			{
				if(val==max)
				{
					answer=key;
				}
			}
			
		}
		System.out.println(answer);
	
	}

}
