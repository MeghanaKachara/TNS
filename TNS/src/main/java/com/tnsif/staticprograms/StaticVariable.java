package com.tnsif.staticprograms;

public class StaticVariable 
{
	int eid;
	String name;
	static String company="TNS";
	StaticVariable(int e, String n)
	{
		eid=e;
		name=n;
	}
	void display()
	{
		System.out.println("id: "+ eid+"\n"+"name: " +name+"\n" +"company: "+company);

	}
}
