package com.tnsif.overriding;

public class Override 
{
	public static void main(String[] args) 
	{
		SBI s=new SBI();
		System.out.println(s.getRateofInterest());
		RBI r=new RBI();
		System.out.println(r.getRateofInterest());
	}
}