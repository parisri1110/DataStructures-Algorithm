package com.arrays.coding.questions;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElement {

	public static void main(String[] args) {

    int arr[] = new int[]{10,70,30,90,30,50,70};
        
      int n = arr.length;
      int res=  duplicate(arr);
      
        
	    System.out.println(res);
	  

	}

	private static int duplicate(int[] arr) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			int key=arr[i];
			hm.put(key, hm.getOrDefault(key, 0)+1);
		}
		
		int count=0;
		
		for(Map.Entry<Integer, Integer> e: hm.entrySet())
		{
			if(e.getValue()>=2)
			{
				count=e.getKey();
				System.out.println(count+" ");
			}
		}
		
		return count;
	}

}
