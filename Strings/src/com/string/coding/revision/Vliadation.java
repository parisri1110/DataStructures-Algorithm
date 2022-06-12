package com.string.coding.revision;

import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vliadation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String inputString = "ehello@123"; Pattern pattern =
		 * Pattern.compile("[^a-zA-Z0-9]"); Matcher matcher =
		 * pattern.matcher(inputString); boolean isStringContainsSpecialCharacter =
		 * matcher.find(); if(isStringContainsSpecialCharacter)
		 * System.out.println(true); else System.out.println(false);
		 */
		
		String str="OoD7JsCsRyRo";
		
	boolean res=validate(str);
	
		System.out.println(res);
		
	}	

	private static boolean validate(String str) {
		// TODO Auto-generated method stub
		Pattern regex=Pattern.compile("[^a-zA-Z0-9]");
		Matcher m=regex.matcher(str);

		boolean check=m.find();
		boolean flag=false;
		
		 Predicate<String> p = s -> { 
			 if (s.length() < 10)
			 { 
				 return false; 
			 }
		 
		 for (int i = 0; i < s.length(); i++) {	 
				  if(m.find()) 
				  { 
					return check;
				  }
				  
			 }
		return flag;

		 };
		return p.test(str);
		 
	}
}

