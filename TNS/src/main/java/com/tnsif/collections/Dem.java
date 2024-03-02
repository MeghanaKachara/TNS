package com.tnsif.collections;
import java.util.ArrayList;
public class Dem {

	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList();
		a.add(5);
		a.add("meghana");
		a.add(8.9);
		a.add(null);
		System.out.println(a);
		
		System.out.println("size: "+a.size());
		System.out.println(a.contains(9));
		System.out.println(a.remove(null));
		System.out.println(a.isEmpty());
		System.out.println(a.remove(1));
		System.out.println("size: "+a.size());
		System.out.println(a);
		
	}

}
