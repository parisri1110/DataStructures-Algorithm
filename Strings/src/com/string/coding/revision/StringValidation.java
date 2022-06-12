package com.string.coding.revision;

import java.util.*;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "OoD7JsCsRyRo";
		// OoD7JsCsRyRo

		boolean res = validate(str);

		System.out.println(res);

		// Matcher matcher=regex.matcher(str);
		// Pattern regex=Pattern.compile("[a-zA-Z0-9@#$-*]");
		// Matcher m=regex.matcher(str);

		/*
		 * Predicate<String> p = s -> { if (s.length() >= 10) { return true; }
		 * 
		 * for (int i = 0; i < s.length(); i++) { if(s.length()>=10) { continue; else if
		 * (m.find()) { return true; } } } } return false;
		 * 
		 * };
		 */

		// System.out.println(p.test(str));

		/*
		 * if (str.length() < 10) { System.out.println(false); } else for (int i = 0; i
		 * < str.length(); i++) { if (str.contains(regex)) { System.out.println(true); }
		 * } System.out.println(false);
		 */

	}

	private static boolean validate(String str) {
		// TODO Auto-generated method stub
		if (str.length() < 10)
			return false;

		// Initializing different
		// booelan variables
		// to false for different conditions
		boolean upper = false;
		boolean lower = false;
		boolean special = false;
		boolean numeric = false;

		for (int i = 0; i < str.length(); i++) {

			if (Character.isUpperCase(str.charAt(i))) {
				upper = true;// making upper true if the character is in UpperCase
			} else if (Character.isLowerCase(str.charAt(i))) {
				lower = true;// making lower true if character is in LowerCase
			} else if (Character.isDigit(str.charAt(i))) {
				numeric = true;// making numeric true if the character is a digit
			} else {
				special = true;// making special true if the character is special
			}
		}

		// returning true if all conditions are met
		// else returning false
		return upper && lower && numeric && special;

	}

}
