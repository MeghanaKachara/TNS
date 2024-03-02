package com.tnsif.collections;
import java.util.ArrayList;
public class AList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> s=new ArrayList<String>(); 
		s.add("kiwi");
		s.add("mango");
		s.add("pineapple");
		s.add("kiwi");// duplicates allowed
		
		System.out.println(s);
		s.remove(2);
		System.out.println(s);
		s.add("pineapple");
		System.out.println(s);//maintains insertion order
		s.size();
		s.set(2, null);
		System.out.println(s);
		
	}

}
