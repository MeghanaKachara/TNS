package com.tnsif.staticprograms;

public class Staticmeth 
{
	int rollno;
	String name;
	static String college="BIT";
	
	static void change()
	{
		college="SREYAS";
	}
	
	Staticmeth(int r,String n)
	{
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.println("rollno: "+ rollno+"\n"+"name: " +name+"\n" +"college: "+college);
	}
	
}
