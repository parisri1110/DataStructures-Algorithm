package com.string.coding.revision;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Excep {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		PrintWriter pw=new PrintWriter("abc.txt");
		pw.print(false);
		System.out.println(10/0);

	}

}
