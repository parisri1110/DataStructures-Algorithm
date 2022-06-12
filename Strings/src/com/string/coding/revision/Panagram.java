package com.string.coding.revision;

public class Panagram {

	static final int CHAR=256;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="HeavyDuty";
		
		
		boolean res=panagram(str);
		
		System.out.println(res);
		
		

	}
	private static boolean panagram(String str) {
		// TODO Auto-generated method stub

		boolean upper[]=new boolean [26];
		boolean lower[]=new boolean [26];
		

		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLowerCase(str.charAt(i)))
			{
				 count=str.charAt(i)-'a';
				 lower[count]=true;
			}
		}
		
		
		
		for(int i=0;i<26;i++)
		{
			if(!lower[i])
				return false;
		}
		return true;
	}

}
