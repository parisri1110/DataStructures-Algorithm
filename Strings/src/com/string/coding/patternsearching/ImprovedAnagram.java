package com.string.coding.patternsearching;

public class ImprovedAnagram {

	static final int CHAR = 256;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String txt = "GEEKSFORGEEKS";
		String pat = "FROG";

		boolean res = patSearch(txt, pat);
		System.out.println(res);
	}

	private static boolean patSearch(String txt, String pat) {
		// TODO Auto-generated method stub
		int ctxt[] = new int[CHAR];
		int cpat[] = new int[CHAR];

		for (int i = 0; i < pat.length(); i++) {
			ctxt[txt.charAt(i)]++;
			cpat[pat.charAt(i)]++;
		}

		for (int i = pat.length(); i < txt.length(); i++) {
			if (same(ctxt, cpat)) {
				return true;
			}
			ctxt[txt.charAt(i)]++;
			ctxt[txt.charAt(i - pat.length())]--;

		}

		return false;
	}

	private static boolean same(int[] ctxt, int[] cpat) {
		// TODO Auto-generated method stub
		for (int i = 0; i < CHAR; i++) {
			if (ctxt[i] != cpat[i])
				return true;
		}

		return false;
	}

}
