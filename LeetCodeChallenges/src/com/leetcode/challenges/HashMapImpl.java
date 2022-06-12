package com.leetcode.challenges;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapImpl {

	private int SIZE=769;
	LinkedList<Entry>[] bucket;
	
	public HashMapImpl()
	{
		bucket=new LinkedList[SIZE];
	}
	
	public void put(int key,int value)
	{
		int hash=key%SIZE;
		LinkedList<Entry> entries=bucket[hash];
		if(bucket[hash]==null)
		{
			bucket[hash]=new LinkedList<Entry>();
			bucket[hash].add(new Entry(key,value));
		}
		else
		
			for(Entry e:bucket[hash])
			{
				if(e.key==key)
				{
					e.value=value;
					return;
				}
			}
		bucket[hash].add(new Entry(key,value));
	}
	
	public int get(int key)
	{
		int hash=key%SIZE;
		LinkedList<Entry> entries=bucket[hash];
		if(entries==null)
		{
			return -1;
		}
		else
		{
			for(Entry e: entries)
			{
				if(e.key==key)
				{
					return e.value;
				}
			}
		}
		return -1;
		
	}
	
	public void remove(int key)
	{
		int hash=key%SIZE;
		Entry remove=null;
		if(bucket[hash]==null)
			return;
		else
		{
			for(Entry e:bucket[hash])
			{
				if(e.key==key)
				{
					remove=e;
				}
			}
			if(remove==null)
				return;
			bucket[hash].remove(remove);
		}
	}
	
	class Entry{
		
	private int key;
	private int value;
	
	Entry(int key , int value)
	{
		this.key=key;
		this.value=value;
	}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
