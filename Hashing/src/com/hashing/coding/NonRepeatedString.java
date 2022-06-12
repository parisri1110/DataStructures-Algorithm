package com.hashing.coding;

public class NonRepeatedString {

	static final int CHAR=256;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="zxvczbtxyzvy";
		int count[]=new int[CHAR];
		
		for(int i=0;i<str.length();i++)
		{
			count[str.charAt(i)]++;
		}
		
		for(int i=0;i<str.length();i++)
		{
			if(count[str.charAt(i)]==1)
			{
				//System.out.println((char)(str.charAt(i))+" "+count[str.charAt(i)]);
				System.out.println((char)(str.charAt(i)));
				break;
			}
			else
				System.out.println("$");
		}
	}

}
