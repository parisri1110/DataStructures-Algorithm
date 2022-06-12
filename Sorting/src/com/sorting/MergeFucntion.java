package com.sorting;

import java.util.Scanner;

public class MergeFucntion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of eleemnts");

		int n = sc.nextInt();
		int l=sc.nextInt();
		int m=sc.nextInt();
		int h=sc.nextInt();

		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sorting(a,l,m,h);
		for(int x:a)
		{
			System.out.print(x+" ");
		}

	}

	private static void sorting(int[] a, int l, int m, int h) {
		// TODO Auto-generated method stub
		int left[]=new int[m-l+1];
		int right[]=new int[h-m];
		int n=a.length;
		
		for(int i=0;i<left.length;i++)
		{
			left[i]=a[l+i];
		}
		for(int j=0;j<right.length;j++)
		{
			right[j]=a[m+1+j];
		}
		
		
		int i=0,j=0,k=0;
		while(i<left.length && j<right.length)
		{
			if(left[i]<=right[j])
			{
				a[k]=left[i];
				i++;
				k++;
			}
			else
			{
				a[k]=right[j];
				j++;
				k++;
			}
		}
		while(i<left.length)
		{
			a[k]=left[i];
			i++;
			k++;
		}
		while(j<right.length)
		{
			a[k]=right[j];
			j++;
			k++;
		}
		
		
	}

}
