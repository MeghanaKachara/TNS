package com.tnsif.multithreading;
//EXTENDING THREAD CLASS
public class Extending extends Thread
{
	@Override
	public void run() 
	{
		System.out.println("welcome");
	}
	public static void main(String[] args) 
	{		
		Extending e=new Extending();
		e.start();	
	}

	
}
