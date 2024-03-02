package com.tnsif.multithreading;

public class ImpRunnable implements Runnable
{
	@Override
	public void run() 
	{
		System.out.println("hello");
	}

	public static void main(String[] args) 
	{
		ImpRunnable r=new ImpRunnable();
		Thread t=new Thread();
		t.start();
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		System.out.println(t.isAlive());
	}
	
}
