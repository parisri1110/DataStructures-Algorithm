package com.searchingandsorting.coding.questions;

import java.util.Scanner;

public class SumMiddleElements {

	public static void main(String[] args) {

		int ar1[] = new int[]{1,2,4,6,10};
		int ar2[] = new int[]{4,5,6,9,12};
		
		int sum=sorting(ar1,ar2);
		System.out.println(sum);

	}

	private static int sorting(int[] ar1, int[] ar2) {

		int l=ar1.length;
        int h=ar2.length;
        
        
        int count[]=new int[l+h];
        int i=0,j=0,k=0;
        while(i<l && j<h)
        {
            if(ar1[i]<ar2[j])
            {
               count[k]=ar1[i];
               k++;
               i++;
            }
            else
            {
                count[k]=ar2[j];
                k++;
                j++;
            }
        }
        while(i<l)
        {
            count[k]=ar1[i];
            k++;
            i++;
        }
         while(j<h)
        {
            count[k]=ar2[j];
            k++;
            j++;
        }
        int len=count.length;
        int low=0;
        int high=count.length-1;
        int sum=0;
        int mid=0;
        while(low<=high)
        {
            mid=(low+high)/2;
        }
        sum=sum+count[mid]+count[mid-1];
        return sum;
    }
		
	}

	


