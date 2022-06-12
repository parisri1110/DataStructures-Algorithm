package com.string.coding.revision;

import java.util.HashSet;
import java.util.Set;

public class Vowels {

	public static void main(String[] args) {

		//String vow="'a','e','i','o','u'";
		String str="whhgbmnrpyroojdvjzhhrfcaubhjjtoqetiwfaqsouhvmseazwdgewfnz";
		
		
		//char[] st=str.toCharArray();
		
		HashSet<Character> vowel=new HashSet<Character>();
	
	for(int  i=0;i<str.length();i++)
	{
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
		{
	
			vowel.add(str.charAt(i));
		}
		
	}
	
		System.out.println(vowel.size());
	}

}





/*
 * for(int i = 0; i < str.length(); i++) { char ch = str.charAt(i); int val =
 * (str.charAt(i) - 'a'); if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||
 * ch == 'u') { if(present[val] == false) { present[val] = true; count++; } }
 * 
 * }
 */
