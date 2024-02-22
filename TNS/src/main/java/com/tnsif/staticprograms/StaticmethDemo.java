package com.tnsif.staticprograms;

public class StaticmethDemo {

	public static void main(String[] args) 
	{
//		Staticmeth.change();
		Staticmeth s1=new Staticmeth(1,"shanthi");
		Staticmeth s2=new Staticmeth(2,"meghana");
		Staticmeth s3=new Staticmeth(3,"rosy");
		s1.display();
		s2.display();
		s3.display();
		Staticmeth.change();
		s1.display();
		s2.display();
		s3.display();
	}

}
