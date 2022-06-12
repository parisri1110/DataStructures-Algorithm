package com.string.coding.revision;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Java";
		String s2 = "Java";
		String s3=new String("Java");
		String s4=s3.concat(s2);
		System.out.println(s4);
		s1.concat("world");
		System.out.println(s1);
		StringBuilder sb1 = new StringBuilder();
		sb1.append("Ja").append("va");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(sb1.toString() == s1);
		System.out.println(sb1.toString().equals(s1));
		System.out.println(s1.equals(s3));
		System.out.println(s1==s3);

	}

}
