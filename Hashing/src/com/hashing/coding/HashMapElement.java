package com.hashing.coding;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);

				System.out.println("no of elements");
				
				
				int n = sc.nextInt();

				int arr[] = new int[n];
				for(int i=0;i<n;i++)
				{
					arr[i]=sc.nextInt()	;
							}
				
				HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
				for (int i : arr) {
					hm.put(i, hm.getOrDefault(i, 0)+1);
				}
				for(Map.Entry<Integer, Integer> e:hm.entrySet())
				{
					System.out.println(e.getKey()+" "+e.getValue());
				}
					
				}
	}


