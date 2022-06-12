package com.hashing.coding.revision;

public class DriverHashMap {

	public static void main(String[] args) {
		HashMapImpl<String, String> myHashMap = new HashMapImpl<String, String>();
		    myHashMap.put("A", "B");
		    myHashMap.put("E", "F");
		    myHashMap.put("H", "P");
		    myHashMap.put("P", "2");
		    myHashMap.put("1",  "G");
		    myHashMap.put("2", "6");
		    myHashMap.put("3", "2");
		    myHashMap.put("4", "4");
		    myHashMap.put("1",  "H");
		 
		 
	    System.out.println(myHashMap);
		    System.out.println(myHashMap.get("A"));
		    System.out.println(myHashMap.remove("A"));
		  //  myHashMap.remove("2");
		    System.out.println(myHashMap);
		  }

	}


