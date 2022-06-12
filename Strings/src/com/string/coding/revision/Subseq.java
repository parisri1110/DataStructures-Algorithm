package com.string.coding.revision;

public class Subseq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "010101";
		String s2 = "101101";
		int j=0;
		int count=0;
		if(s1.length()<s2.length())
		{
			System.out.println("Not a subsequence");
		}
		else
			for(int i=0;i<s1.length()&& j<s2.length();i++)
			{
				if(s1.charAt(i)==s2.charAt(j))
					j++;
				count++;
			}
		System.out.println(count);
		if(j==s2.length())
			System.out.println("true");
		else
			System.out.println("false");
	}

}
