package com.tnsif.collections;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


public class Demo 
{
	public static void main(String[] args) 
	{
	List<Laptop> l=new ArrayList<Laptop>();
	l.add(new Laptop("dell",1000000,8));
	l.add(new Laptop("apple",5000000,16));
	l.add(new Laptop("lenovo",900000,6));
	System.out.println(l);
	
	Collections.sort(l);
	for(Laptop p:l)
	{
		System.out.println(p);
	}
	}

}
