package com.string.coding.revision;

public class SubsequenceGeeks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1="gksrek";
		String s2="geeksforgeeks";
		
		
		boolean res=subse(s1,s2);
		System.out.println(res);

	}

	private static boolean subse(String s1, String s2) {

		int i=0;
		if(s2.length()<s1.length())
		{
			return false;
		}
		else {
		for(int j=0;j<s2.length()&& i<s1.length();j++)
		{
			if(s2.charAt(j)==s1.charAt(i))
			{
				i++;
			}
		}
		
		}
		if(i==s1.length())
		{
			return true;
		}
		return false;
	}

}
