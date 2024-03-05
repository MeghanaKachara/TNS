package com.tnsif.lambda;
//TO DEMONSTRATE LAMBDA EXPRESSION FOR MULTITHREADING
public class Test 
{
	public static void main(String[] args) 
	{
	Runnable basic=()->{ String threadname=Thread.currentThread().getName();
	System.out.println("Threadname"+threadname);};
	
	Thread t1=new Thread(basic);
	Thread t2=new Thread(basic);
	
	t1.start();
	t2.start();
	
	}
}
