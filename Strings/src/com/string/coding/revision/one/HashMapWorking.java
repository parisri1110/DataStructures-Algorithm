package com.string.coding.revision.one;

import java.util.HashMap;

public class HashMapWorking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String> h=new HashMap<String,String>();
		h.put("paritosh", "srivastava");

		h.put("paritosh", "1");
		h.get("paritosh");
		
		String s1="paritosh";
		String s2="srivastava";
		String s3=new String("paritosh");
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(h.toString());
	}
	

}
