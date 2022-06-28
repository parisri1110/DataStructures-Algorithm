package com.string.coding.revision;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Excep {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
	
		
		
		String s1="paritosh";
		String s2="paritosh";
		s1="pari";
		System.out.println(s1);
		System.out.println(s2.concat(s1));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s1));

	}

}
