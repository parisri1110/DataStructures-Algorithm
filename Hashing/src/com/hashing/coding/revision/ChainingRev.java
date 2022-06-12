package com.hashing.coding.revision;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import com.hashing.coding.Chaining;

public class ChainingRev {

	int bucket;
	ArrayList<LinkedList<Integer>> table;
	
	ChainingRev(int b)
	{
		this.bucket=b;
		table=new ArrayList<LinkedList<Integer>>();
		for(int i=0;i<b;i++)
		{
			table.add(new LinkedList<Integer>());
		}
		
	}
		void insert(int key)
		{
			int i=key%bucket;
			table.get(i).add(key);
		}

		void remove(int key)
		{
			int i=key%bucket;
			table.get(i).remove(key);
		}
		
		boolean search(int key)
		{
			int i=key%bucket;
			return table.get(i).contains(key);
		}
	
	
	
	public static void main(String[] args) {
		 System.out.println("Enter value of buceket");
			Scanner sc= new Scanner(System.in);
			
			int b=sc.nextInt();
			ChainingRev c=new ChainingRev(b);
			c.insert(70);
			c.insert(34);
			c.insert(21);
			System.out.print(c.search(21));
			c.remove(34);
			
	}
	
}
