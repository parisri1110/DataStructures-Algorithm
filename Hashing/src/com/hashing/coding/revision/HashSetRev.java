package com.hashing.coding.revision;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> h=new HashSet<String>();
h.add("pari");
h.add("a");
h.add("b");
h.add("a");
System.out.println(h);
//System.out.println(h.contains("a"));
Iterator<String> i=h.iterator();
while (i.hasNext()) {
	System.out.println(i.hasNext());
	break;
	
}
		
	}

}
