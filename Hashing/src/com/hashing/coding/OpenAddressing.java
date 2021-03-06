package com.hashing.coding;

import java.util.Scanner;

public class OpenAddressing {
	
	int arr[];
	int cap,size;
	
	OpenAddressing (int b)
	{
		this.cap=b;
		size=0;
		arr=new int[cap];
		for(int i=0;i<cap;i++)
		{
			arr[i]=-1;
		}
	}
	
	int OpenAddressing (int key)
	{
		return key%cap;
	}
	
	
	boolean insert(int key)
	{
		if(size==cap)
			return false;
		int i=OpenAddressing(key);
		while(arr[i]!=-1 && arr[i]!=-2 && arr[i]!=key) {
			i=(i+1)%cap;
		}
		if(arr[i]==key)
			return false;
		else
		
			arr[i]=key;
			size++;
		
		return false;
			
	}
	
	
	  boolean search(int key) { 
		  int op=OpenAddressing(key);
		  int i=op;
		  
		  while(arr[i]!=-1) {
			  if(arr[i]==key)
				  return true;
			  i=(i+1)%cap;
			  if(i==op)
				  return false;
		  
		  }
		  return false;
	  }
	 
	boolean remove(int key)
	{
		  int op=OpenAddressing(key);
		  int i=op;
		  
		  while(arr[i]!=-1)
		  {
			  if(arr[i]==key)
			  {
				  arr[i]=-2;
				  return true;
			  }
			  i=(i+1)%cap;
			  if(i==op)
				  return false;
		  }
		
		return false;
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.out.println("Enter value of buceket");
			Scanner sc= new Scanner(System.in);
			
			int b=sc.nextInt();

			OpenAddressing op =new OpenAddressing(b);
			op.insert(49);
			op.insert(56);
			op.insert(72);
			if(op.search(8)==true)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
			if(op.remove(99)==true)
			{
				System.out.println("No deleted");
			}
			else
			{
				System.out.println("no not deleted");
			}

	}

}
