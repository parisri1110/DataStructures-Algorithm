package com.leetcode.challenges;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class HashSetImpl {

	private int SIZE=769;
	List<List<Integer>> bucket;
	
	public HashSetImpl()
	{
		bucket=new ArrayList<>(SIZE);
		for(int i=0;i<SIZE;i++)
		{
			bucket.add(null);
		}
	}
	
	public void add(int key)
	{
		int hash=key%SIZE;
		List<Integer> childList =bucket.get(hash);
		if(childList==null)
		{
			List<Integer> list=new LinkedList<>();
			list.add(key);
			bucket.set(hash, list);
		}
		else
			if(!childList.contains(key))
			{
				childList.add(key);
			}
	}
	public void remove(int key)
	{
		int index=key%SIZE;
		List<Integer> childList=bucket.get(index);
		if(childList!=null)
		{
			childList.remove(Integer.valueOf(key));
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LocalDate date=LocalDate.now();
		Date date=new Date();
		SimpleDateFormat d=new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println(" date " +d.format(date));
		
		String dm=d.format(date);
		System.out.println(dm);
		Date newDate=null;
		String op=null;
		try {
			newDate=d.parse(dm);
			System.out.println("new date " + newDate);
			op=d.format(newDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(date);
		System.out.println("finla " +op);
	}

}
