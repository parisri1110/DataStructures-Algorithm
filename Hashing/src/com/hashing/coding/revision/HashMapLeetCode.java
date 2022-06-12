package com.hashing.coding.revision;

import java.util.LinkedList;

public class HashMapLeetCode {
	
	
	private int SIZE=769;
	LinkedList<Entry>[] bucket;
	
	public HashMapLeetCode()
	{
	   bucket=new LinkedList[SIZE];
	}
	
	
	public void put(int key , int value)
	{
		int hash=key%SIZE;
		if(bucket[hash]==null)
		{
			bucket[hash]=new LinkedList<Entry>();
			bucket[hash].add(new Entry(key, value));
		}
		else
			for (Entry entry : bucket[hash]) {
				if(entry.key==key)
				{
					entry.value=value;
					return;
				}
			}
		bucket[hash].add(new Entry(key, value));
	}

	public int get(int key)
	{
		int hash=key%SIZE;
		LinkedList<Entry> entries=bucket[hash];
		if(entries==null)
			return -1;
		for (Entry entry : entries) {
			if(entry.key==key)
			{
				return entry.value;
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
		else {
		for(Entry entry:bucket[hash])
		{
		 if(entry.key==key)
		 {
			 remove=entry;
		 }
		}
		if(remove==null)
			return;
		bucket[hash].remove(remove);
		}
	}
	
	
	public class Entry{
		private int key;
		private int value;
		
		public Entry(int key,int value)
		{
			this.key=key;
			this.value=value;
		}
	}

	public static void main(String[] args) {

	}

}
