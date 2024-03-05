package com.tnsif.lambda;
import java.util.ArrayList;
public class Collection {

	public static void main(String[] args) 
	{
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(58);
		l.add(5);
		l.add(10);
		l.add(9);
		l.add(45);
		
		System.out.println(l);
		
		for(Integer e:l)
		{
			System.out.println(e);
		}
		
		
		System.out.println("----------LAMBDA EXPRESSION-----------------");
		l.forEach(element -> System.out.println(element));
	}

}
