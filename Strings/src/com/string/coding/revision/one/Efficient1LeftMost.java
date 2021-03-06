package com.string.coding.revision.one;

import java.util.Arrays;

public class Efficient1LeftMost {

	private static final int CHAR=256;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "geeksforgeeks";
        System.out.println("Index of leftmost repeating character:");
        System.out.println(leftMost(str));
	}
	private static int leftMost(String str) {
		// TODO Auto-generated method stub
		int findex[]=new int[CHAR];
		Arrays.fill(findex,-1);
		int res=Integer.MAX_VALUE;
		for(int i=0;i<str.length();i++)
		{
			int fi=findex[str.charAt(i)];
			if(fi==-1)
			{
				findex[str.charAt(i)]=i;
			}
			else
			{
				res=Math.min(res, fi);
			}
		}
		return (res==Integer.MAX_VALUE)?-1 : res;
	}

}
