package com.string.coding;

import java.util.Arrays;

public class Efficient1LeftmostNonRepeatingChar {

	static final int CHAR=256;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "qtwibcnptcchedpwjhusvhkuuynhtrmppehsgjsoxlfbxfndmjsbhxffxabuafkclehlepifxthlbdqcodscdblqxvbeimjbrjvybqndmpofltamyvkkghlfnnikwfsypeyarwqhmxlwdvqqolmywacaeewdgihqthsrdwnvdokvpqdmrnio";
		
		int res=leftrep(str);
		
		System.out.println(res);

	}

	private static int leftrep(String str) {
		// TODO Auto-generated method stub
		int fidx[]=new int[CHAR];
		
		int res=Integer.MAX_VALUE;
		Arrays.fill(fidx, -1);
		
		for(int i=0;i<str.length();i++)
		{
			
			if(fidx[str.charAt(i)]==-1)
			{
				fidx[str.charAt(i)]=i;
			}
			else
			{
				fidx[str.charAt(i)]=-2;
			}
		}
			for(int i=0;i<CHAR;i++)
			{
				if(fidx[i]>=0)
				{
					res=Math.min(res, fidx[i]);
				}
			}
		
		
		
		return (res==Integer.MAX_VALUE)?-1:res;
	}

}
