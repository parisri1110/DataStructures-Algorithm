package com.string.coding;

public class EfficientLeftRepeating {

	static final int CHAR=256;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "geeksforgeek";
		
		int res=leftrep(str);
		
		System.out.println(res);

	}
	private static int leftrep(String str) {
		// TODO Auto-generated method stub
		
		int count[]=new int[CHAR];
		
		for(int i=0;i<str.length();i++)
		{
			count[str.charAt(i)]++;
		}
		
		for(int i=0; i<str.length();i++)
		{
			if(count[str.charAt(i)]>1)
			{
				return i;
			}
		}
		
		return -1;
	}

}
