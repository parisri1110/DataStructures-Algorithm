package com.string.coding.patternsearching;

public class Anagram {

	static final int CHAR=256;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt= "GEEKSFORGEEKS";
		String pat= "RSEEKS";
		
		boolean res=patSearch(txt , pat);
		System.out.println(res);
		
		
	}

	private static boolean patSearch(String txt, String pat) {
		// TODO Auto-generated method stub
		
		int n=txt.length();
		int m=pat.length();
		
		for(int i=0;i<=n-m;i++)
		{
			if(Anagram(txt,pat,i))
				return true;
			
		}
		return false;
		
	}

	private static boolean Anagram(String txt, String pat, int i) {
		// TODO Auto-generated method stub
		
		int count[]=new int[CHAR];
		for(int j=0;j<pat.length();j++)
		{
			count[pat.charAt(j)]++;
			count[txt.charAt(i+j)]--;
		}
		
		for(int j=0;j<CHAR;j++)
		{
			if(count[j]!=0)
			{
				return false;
			}
		}
		
		return true;
	}

}
