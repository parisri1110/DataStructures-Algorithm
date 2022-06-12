package com.hashing.coding.revision;

import java.util.HashMap;
import java.util.Map;

public class HashMapRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "a");
		hm.put(2, "b");
		hm.put(3, "c");
		hm.put(4, "a");
		System.out.println(hm);
		
		System.out.println(hm.size());
		
		for(Map.Entry<Integer, String> e: hm.entrySet())
		{
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}

}
