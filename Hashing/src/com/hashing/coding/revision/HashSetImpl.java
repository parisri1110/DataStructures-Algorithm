package com.hashing.coding.revision;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HashSetImpl {
	
	private int MAX_VALUE=100000;
	private int ARRAY_SIZE=10;
	List<List<Integer>> bucket;
	
	public HashSetImpl()
	{
		bucket=new ArrayList<>(ARRAY_SIZE);
		for(int i=0;i<ARRAY_SIZE;i++)
		{
			bucket.add(null);
		}
	}
	
	public void add(int key)
	{
		int index=key%ARRAY_SIZE;
		List<Integer> childList=bucket.get(index);
		if(childList==null) {
			List<Integer> list=new LinkedList<>();
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
		int index=key%ARRAY_SIZE;
		List<Integer> childList=bucket.get(index);
		if(childList!=null)
		{
			childList.remove(Integer.valueOf(key));
		}
	}
	
	
	

	public static void main(String[] args) {
		HashSetImpl hs=new HashSetImpl();
		hs.add(10);
		hs.add(20);
		hs.add(5);

	}

}
