package com.string.coding.revision;

import javax.print.DocFlavor.CHAR_ARRAY;

public class AnagramRev {

	static final int CHAR=256;
	public static void main(String[] args) {
		String s1="listen";
		String s2="silent";
		
		char[] ch=s1.toCharArray();
		
		int count[]=new int[CHAR];
		
		if(s1.length()!=s2.length())
		{
			System.out.println("not a anagram");
			
		}
		else
		{
			for(int i=0;i<s1.length();i++)
			{
				count[s1.charAt(i)]++;
				count[s2.charAt(i)]--;
			}
		}
		
	for(int i=0;i<s1.length();i++)
	{
		if(count[i]!=0)
		{
			System.out.println("not a anagram");
		}
	}
	
			System.out.println("a nanagra,");
	
	}

}
