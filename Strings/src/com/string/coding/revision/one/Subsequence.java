package com.string.coding.revision.one;

public class Subsequence {

	public static void main(String[] args) {
		String s1 = "ABCDE";
		String s2 = "AE";
		int j=0;
		
		for(int i=0;i<s1.length()&& j<s2.length();i++)
		{
			if(s1.charAt(i)==s2.charAt(j))
			{
				j++;
			}
		}
		if(j==s2.length())
		{
			System.out.println("it's a subsequnce");
		}
		else 
			System.out.println("not a subseq");
		

	}

}
