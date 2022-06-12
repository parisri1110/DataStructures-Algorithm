package com.arrays.coding;

import java.util.Scanner;

public class Majortiy {

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

		System.out.println("first element");
		int x = sc.nextInt();
		
		System.out.println("second element");

		int y=sc.nextInt();
		
		int count = 0;
		int count1 = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == x) {
				count++;
			}
			if (arr[i] == y) {
				count1++;
			}

		}

		if(count==count1 || count>count1 )
		{
			
				System.out.println(x);
			
				if(count1>count)
				{
				
					System.out.println(y);
				}
			
		}
		else
			if(x>y)
				System.out.println(y);
			else
				System.out.println(x);
		
	
	}

}
