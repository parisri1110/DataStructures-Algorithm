package com.hashing.coding.revision;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WinnerElection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("EEnter no of elements");
		int n=sc.nextInt();
		String str[]=new String[n];
		
		for(int i=0;i<n;i++)
		{
			str[i]=sc.next();		
			}
		
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		
		for(int i=0;i<str.length;i++)
		{
			String key=str[i];
			hm.put(key, hm.getOrDefault(key, 0)+1);
		}
		System.out.println(hm);
		
		int maxx=0;
		String answer="";
		
		for(Map.Entry<String, Integer> e:hm.entrySet())
		{
			String key=e.getKey();
			Integer val=e.getValue();
			
			if(val>maxx)
			{
				maxx=val;
				answer=key;
			}
			else
				if(val==maxx && answer.compareTo(key)>0)
					answer=key;
		}
		String result[]= {answer,maxx+" "};
		
		for(int i=0;i<result.length;i++)
        {
        	System.out.println(result[i]);
        }
	}

}
