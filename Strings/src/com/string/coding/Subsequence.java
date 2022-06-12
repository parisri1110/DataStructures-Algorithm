package com.string.coding;

public class Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "ABCDE";
		String s2 = "AE";
		int j = 0;

		if (s1.length() < s2.length()) {
			System.out.println("not a subsequence");
		} else {

			for (int i = 0; i < s1.length() && j < s2.length(); i++) {
				if (s1.charAt(i) == s2.charAt(j)) {
					j++;
				}
			}
		}
		if (j == s2.length())
			System.out.println("true");
		else
			System.out.println("false");

	}

}
