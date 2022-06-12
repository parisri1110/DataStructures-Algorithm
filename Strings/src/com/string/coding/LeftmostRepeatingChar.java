package com.string.coding;

public class LeftmostRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abscced";
		
		
		int res=leftrep(str);
		
	System.out.println(res);
		
	}

	private static int leftrep(String str) {
		// TODO Auto-generated method stub
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j)) {
					return i;
				}
			}
		}
		return -1;
		
	}

}
