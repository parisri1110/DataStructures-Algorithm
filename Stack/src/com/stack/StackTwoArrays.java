package com.stack;


/* Implementation of Two Stacks with one Array */
public class StackTwoArrays {
	
	int cap;
	int arr[];
	int top1;
	int top2;
	
	public StackTwoArrays(int cap) {
		this.cap=cap;
		this.arr=new int[cap];
		this.top1=-1;
		this.top2=cap;
	}
	
	public void push1(int x)
	{
		if(top1<top2-1)
		{
			top1++;
			arr[top1]=x;
		}	
		else
		{
			System.out.println("stack overflow");
			System.exit(1);
		}
	}
	
	public void push2(int x)
	{
		if(top1<top2-1)
		{
			top2--;
			arr[top2]=x;
		}
		else
		{
			System.out.println("stack underflow");
			System.exit(1);
		}
	}
	
	public int pop1()
	{
		if(top1>=0)
		{
			int x=arr[top1];
			top1--;
			return x;
		}
		 else
	        {
	            System.out.println("Stack Underflow");
	            System.exit(1);
	        }
	        return 0;
	}
	public int pop2()
	{
		if(top2< cap)
		{
			int x=arr[top2];
			top2++;
			return x;
		}
		 else
	        {
	            System.out.println("Stack Underflow");
	            System.exit(1);
	        }
	        return 0;
	}
	

	public static void main(String[] args) {
		
		StackTwoArrays s=new StackTwoArrays(5);
		s.push1(5);
		s.push2(10);
		s.push2(15);
		s.push1(20);
		   System.out.println("Popped element from" +
                   " stack1 is " + s.pop1());
s.push2(40);
System.out.println("Popped element from" +
                 " stack2 is " + s.pop2());

	}

}
