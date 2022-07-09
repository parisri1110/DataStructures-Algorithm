package com.queue;

import java.util.Stack;

/**
 *  Queue Using Stack
 *  Need two Stacks
 * 
 * **/

public class QueueUsingStack {
	
	Stack<Integer> s1=new Stack<Integer>();
    Stack<Integer> s2=new Stack<Integer>();
    
    void enqueue(int x)
    {
    	while(!s1.isEmpty())
    	{
    		s2.push(s1.pop());
    	}
    	s1.push(x);
    	while(!s2.isEmpty())
    	{
    		s1.push(s2.pop());
    	}
    }
    
    int dequeue()
    {
    	if(s1.isEmpty())
    		 System.out.println("Q is Empty"); 
    	int x=s1.pop();
    	return x;
    }
    
	public static void main(String[] args) {
		QueueUsingStack q=new QueueUsingStack(); 
		    q.enqueue(1); 
		    q.enqueue(2); 
		    q.enqueue(3); 

		    System.out.println(q.dequeue()); 
		    System.out.println(q.dequeue());
		    System.out.println(q.dequeue());
	}

}
