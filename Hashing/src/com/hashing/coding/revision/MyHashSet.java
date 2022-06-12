package com.hashing.coding.revision;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MyHashSet {


	private int MAX_VALUE=100000;
	private int SIZE=10;
	List<List<Integer>> bucket;
	
	public MyHashSet()
	{
		bucket=new ArrayList<>(SIZE);
		for(int i=0;i<SIZE;i++)
		{
			bucket.add(null);
		}
	}
	
	public void add(int key)
	{
		int index=key%SIZE;
		List<Integer> childList=bucket.get(index);
		if(childList==null)
		{
			List<Integer> list=new LinkedList<Integer>();
			list.add(key);
			bucket.set(index, list);
		}
		else
		if(!childList.contains(key))
		{
			childList.add(key);
		}
		
	}
	
	public void remove(int key)
	{
		int index=key%SIZE;
		List<Integer> childList=bucket.get(index);
		if(childList!=null)
		{
			childList.remove(Integer.valueOf(key));
		}
	}
	
	public boolean contains(int key)
	{
		int index=key%SIZE;
		List<Integer> childList=bucket.get(index);
		return childList!=null && childList.contains(key);
		
	}
	
	
	
	
	
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		  for (int i = 0; i < SIZE; i++) {
		      if (bucket != null) {
		        sb.append(i + " " + bucket + "\n");
		      } else {
		        sb.append(i + " " + "null" + "\n");
		      }
		    }
		 
		    return sb.toString();
		  
	}

	public static void main(String[] args) {
		MyHashSet hash=new MyHashSet();
		//hash.add(25);
		hash.add(200);
		hash.add(300);
		hash.add(250);
		hash.remove(200);
		hash.contains(200);
	}

}
