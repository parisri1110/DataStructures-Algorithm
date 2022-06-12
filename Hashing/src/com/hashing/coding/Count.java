package com.hashing.coding;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("EEnter no of elements");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt()	;
					}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

		int count=0;
		boolean flag=false;
		
		for(int i=0;i<arr.length;i++)
		{
			flag=false;
			for(int j=0;j<i;j++)
			{
				if(arr[i]==arr[j])
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}
