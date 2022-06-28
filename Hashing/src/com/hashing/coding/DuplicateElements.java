package com.hashing.coding;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElements {
public static void main(String[] args) {
	int arr[]= {2,3,4,3,2,5,1,6};
	
	Set<Integer> hs=new HashSet<Integer>();
	
	for(int i=0;i<arr.length;i++)
	{
		hs.add(arr[i]);
	}
	System.out.println(hs);
	Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
	
	for(int i=0;i<arr.length;i++)
	{
		if(hm.get(arr[i])==null)
		{
			System.out.print(arr[i]+" ");
		}
		hm.put(arr[i], 1);
		/*int key=arr[i];
		hm.put(key, hm.getOrDefault(key, 0)+1);*/
	}
	
}
}
