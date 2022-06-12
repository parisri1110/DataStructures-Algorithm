package com.string.coding.patternsearching;

public class EfficientRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "CRICKET";
		String s2 = "CKETCRI";
		
	boolean res=rotation(s1,s2);
	System.out.println(res);
		

	}

	private static boolean rotation(String s1, String s2) {
		// TODO Auto-generated method stub
		if(s1.length()!=s2.length())
			return false;
		
		return ((s1+s1).indexOf(s2)>=0);
	}

}
