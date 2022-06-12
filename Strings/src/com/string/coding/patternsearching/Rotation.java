package com.string.coding.patternsearching;

public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "CRICKET";
		String s2 = "KCICETR";
		
	boolean res=rotation(s1,s2);
	System.out.println(res);
		
		
	}

	private static boolean rotation(String s1, String s2) {
		
		for(int i=0;i<s1.length();i++)
		{
			String s3=s1+s1;
			
				if(s3.contains(s2))
				{
					return true;
				}
			
			
		}
		
		
		return false;
		// TODO Auto-generated method stub
		
	}

}
