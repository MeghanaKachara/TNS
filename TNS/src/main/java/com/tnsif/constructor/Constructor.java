package com.tnsif.constructor;

public class Constructor 
{
	Constructor()
	{
		System.out.println("default constructor");
	}
	Constructor(int a){
		System.out.println("constructor with one parameter");
		
	}
	Constructor(int a,String b){
		System.out.println("constructor with two parameter");
	}

public static void main(String[] args) 
{
	Constructor c=new Constructor();
	Constructor d=new Constructor(5);
	Constructor e=new Constructor(7);
	System.out.println(d);
	System.out.println(e);
	
}
}
