package com.string.coding;

public class EfficientAnagram {

	static final int CHAR=256;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="aabca";
		String s2="acaba";
		
		char[] a=s1.toCharArray();
		
		
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
	
		
		for(int i=0;i<CHAR;i++)
		{
			//if(count[s1.charAt(i)] != count[s2.charAt(i)])
			if(count[i]!=0)
			{
				System.out.println("not a anagram");
			}
			System.out.println("anagram");
		}
		
			
		
	}

}
