package com.recursion.coding;

public class BinarySearch {

	public static void main(String[] args) {
	
		int arr[]= {2,4,6,7,9,10};
		int target=9;
		
		System.out.println(search(arr,target,0,arr.length-1));

	}

	private static int search(int[] arr, int target, int l, int h) {
	
		if(l>h) {
			return -1;
		}
		int mid=l+(h-l)/2;
		
		if(target==arr[mid])
			return mid;
		if(target<arr[mid])
			return search(arr,target,l,mid-1);
	
		return search(arr,target,mid+1,h);
		
	}

}
