package com.hashing.coding;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WinnerOfAnElection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("EEnter no of elements");
		int n=sc.nextInt();


		String str[]=new String[n];
		
		for(int i=0;i<str.length;i++)
		{
			str[i]=sc.next();
		}
		
		HashMap<String,Integer> hm=new HashMap<String , Integer>();
		
		
		
		
		for(int i=0;i<str.length;i++)
		{
			String key=str[i];
			hm.put(key, hm.getOrDefault(key, 0)+1);
		}

		int maxx=0;
	
		String answer ="";
		  for (Map.Entry<String,Integer> entry : hm.entrySet()) 
	        { 
	            String key  = entry.getKey(); 
	            Integer val = entry.getValue();
	            
	            //updating answer whenever we get any name with frequency 
	            //greater than frequency of name stored previously.
	            if (val > maxx) 
	            { 
	                maxx = val; 
	                answer = key; 
	            } 
	            //if frequency of current name is same as the previously 
	            //stored name then we compare both names and store 
	            //lexicographically smaller name.
	            else if (val == maxx && 
	                answer.compareTo(key) > 0) 
	                answer = key; 
	        } 
	        
	        //storing name with highest votes and the number of votes in a list.
	        String result[] = {answer,maxx+""};
		/*
		 * for(Map.Entry<String, Integer> e:hm.entrySet()) {
		 * //System.out.println(e.getKey()+" "+e.getValue());
		 * max=Collections.max(hm.values()); if(max==e.getValue()) { //Collections.
		 * val=e.getValue(); ans=e.getKey();
		 * System.out.println(e.getKey()+" "+e.getValue()); break; }
		 * 
		 * } String res[]= {ans,val+""}; for(int i=0;i<res.length;i++) {
		 * System.out.println(res); } //System.out.println(max);
		 */	
	        for(int i=0;i<result.length;i++)
	        {
	        	System.out.println(result[i]);
	        }
	}
	

}
