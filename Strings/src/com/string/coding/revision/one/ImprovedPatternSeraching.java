package com.string.coding.revision.one;

public class ImprovedPatternSeraching {

	public static void main(String[] args) {
		String txt = "ABCABCD";
		String pat = "ABCD";
		System.out.print("All index numbers where pattern found: ");
		patSearchinng(txt, pat);

	}

	private static void patSearchinng(String txt, String pat) {
		// TODO Auto-generated method stub
		int n = txt.length();
		int m = pat.length();

		// naive
		/*
		 * for(int i=0;i<=n-m;i++) { int j; for(j=0;j<m;j++) {
		 * if(pat.charAt(j)!=txt.charAt(i+j)) { break; } } if(j==m) {
		 * System.out.println(i); } }
		 */

		for (int i = 0; i <= n - m;) {
			int j;
			for (j = 0; j < m; j++) {
				if (txt.charAt(i + j) != pat.charAt(j)) {
					break;
				}
			}
			if (j == m) {
				System.out.println(i);
			}
			if (j == 0) {
				i++;
			} else
				i = i + j;
		}

	}

}
