package com.hashing.coding;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Chaining {

	
		// very important ::Todo HashMap implementation in java
		
		int bucket;
		ArrayList<LinkedList<Integer>> table;
		
		 Chaining(int b)
		{
			this.bucket=b;
			table =new ArrayList<LinkedList<Integer>>();
			for (int i=0;i<b;i++)
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
			 table.get(i).remove();
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
			 Chaining c=new Chaining(b);
			c.insert(70);
			c.insert(71);
			c.insert(9);
			c.insert(56);
			c.insert(72);
			System.out.println(c.search(88));
			c.remove(9);
			System.out.println(c.search(9));
			 
		}
}
