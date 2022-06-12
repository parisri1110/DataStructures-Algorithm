package com.arrays.coding.revision;

import java.util.Scanner;

public class Immediate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("no of elements");
		int n = sc.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("element");
		int X=sc.nextInt();
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<X)
			{
				arr[count]=arr[i];
				count++;
			}
		}

		int flag=0;
		int res=0;
		
		for(int i=0;i<count;i++)
		{
			if(arr[i]>arr[res])
			{
				res=i;
			}
			flag=1;
		}
		if(flag==1)
		System.out.println("element is " + arr[res]);
		else
			System.out.println(-1);
	}

}
