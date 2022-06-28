package com.arrays.coding.questions;

import java.util.HashMap;
import java.util.Map;

public class TwoArrays {

	public static void main(String[] args) {
		int a[] = {1,2,5,4,0};
		int b[] = {2,4,5,0,1};
		
		int n=a.length;
		int m=b.length;
		Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
	      if(n!=m)
	      {
	    	  System.out.println("false");
	      }
	      
	      int count=0;
	      for(int i=0;i<n;i++)
	      {
	          if(hm.get(a[i])==null)
	          {
	        	  hm.put(a[i], 1);
	          }
	          else
	        	 count=hm.get(a[i]);
	          count++;
	          hm.put(a[i], count);
	      }
	      for (int i = 0; i < n; i++) {
	            // If there is an element in arr2[], but
	            // not in arr1[]
	            if (!hm.containsKey(b[i]))
	                System.out.println("false");
	 
	            // If an element of arr2[] appears more
	            // times than it appears in arr1[]
	            if (hm.get(b[i]) == 0)
	            	 System.out.println("false");
	 
	            count = hm.get(b[i]);
	            --count;
	            hm.put(b[i], count);
	        }
	      System.out.println();

	}

}
