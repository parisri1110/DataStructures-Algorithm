package com.hashing.coding.revision;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ArrayListChaining {

	int capacity;
	 ArrayList<LinkedList<Integer>> table;
	
	public ArrayListChaining(int capacity) {
		this.capacity=capacity;
		table= new  ArrayList<LinkedList<Integer>>();
		for(int i=0;i<capacity;i++)
		{
			table.add(new LinkedList<Integer>());
		}
	}
	
	void insert(int key)
	{
		int i=key%capacity;
		table.get(i).add(key);
	}



	public static void main(String[] args) {
		 System.out.println("Enter value of buceket");
			Scanner sc= new Scanner(System.in);
			
			int b=sc.nextInt();
		ArrayListChaining c=new ArrayListChaining(b);
		c.insert(49);
		c.insert(23);
		c.insert(56);

	}

}
