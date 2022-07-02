package com.stack;

public class MyStack {

	int arr[];
	int cap;
	int top;
	
	MyStack(int c)
	{
		this.cap=c;
		this.arr=new int[c];
		this.top=-1;
	}

	public void push(int i) {
		if(top==-1)
		{
			System.out.println("stack is empty");
		}
		top++;
		arr[top]=i;
	}
	
	int pop()
	{
		int res=arr[top];
		top--;
		return res;
	}
	
	int peek()
	{
		if(top==-1)
		{
			System.out.println("stack is empty");
			return Integer.MIN_VALUE;
		}
		return arr[top];
		
	}
	int size(){
        return (top+1);
    }
    
    boolean isEmpty(){
        return top==-1;
    }
}
