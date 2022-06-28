package com.arrays.coding.questions;

import java.util.HashMap;
import java.util.Map;

public class LargestSubarray {

	public static void main(String[] args) {
		int[] arr= {15,-2,2,-8,1,7,10,23};
		
		int res=maxlen(arr);
		System.out.println(res);

	}

	private static int maxlen(int[] arr) {
		
		int sum=0;
		int res=0;
	    Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			
			if(arr[i]==0 && res==0)
			{
				res=1;
			}
			if(sum==0)
			{
				res=i+1;
			}
			 Integer prev=hm.get(sum);
	           if(prev!=null)
	           {
	                res=Math.max(res,i-prev);
	           }
	           else
	           {
	               hm.put(sum,i);
	           }
		}
		
		return res;
	}

}
