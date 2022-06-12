package com.string.coding.revision.one;

import java.util.Arrays;

public class Efficient1NonRepeat {

	private static final int CHAR=256;
	public static void main(String[] args) {

		String str = "abbcda";
        System.out.println("Index of leftmost repeating character:");
        System.out.println(leftMost(str));

	}
	private static int leftMost(String str) {
		// TODO Auto-generated method stub
		
		int index[]=new int[CHAR];
		Arrays.fill(index, -1);
		
		int res=Integer.MAX_VALUE;
		
		for(int i=0;i<str.length();i++)
		{
			if(index[str.charAt(i)]==-1)
			{
				index[str.charAt(i)]=i;
			}
			else
			{
				index[str.charAt(i)]=-2;
			}
		}
		for(int i=0;i<CHAR;i++)
		{
			if(index[i]>=0)
					{
				res=Math.min(res, index[i]);
					}
		}
		
		return (res==Integer.MAX_VALUE)?-1: res;
	}

}
