package com.string.coding.revision;

public class Subseqence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String s1 = "ABCDE";
		String s2 = "AED";
		int j = 0;

		for(int i=0;i<s1.length()&& j<s2.length();i++)
		{
			if(s1.charAt(i)==s2.charAt(j))
			{
				j++;
			}
		}
		if(j==s2.length())
			System.out.println("subseq");
		else 
		System.out.println("not a subseq");
	}

}
