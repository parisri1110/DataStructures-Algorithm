package com.string.coding;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="listen";
		String s2="silent";
		
		if(s1.length()!=s2.length())
			 System.out.println("false");
		
		char a1[]=s1.toCharArray();
		char a2[]=s2.toCharArray();
		
		Arrays.sort(a1);
		//System.out.println(a1);
		
		Arrays.sort(a2);
		//System.out.println(a2);
		
		s1=new String(a1);
		System.out.println(s1);
		
		s2=new String(a2);
		System.out.println(s2);
		
		if(s1.equals(s2))
			System.out.println("true");
		else
			System.out.println("false");

	}

}
