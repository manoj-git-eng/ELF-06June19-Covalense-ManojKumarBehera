package com.covalense.javaapp.wrapper;

public class W1 {

	public static void main(String[] args) 
	{
		int a=5;
		Integer i=new Integer(a);
		System.out.println(a);
		Integer d=new Integer(10);
		int f=d.intValue();
		System.out.println(f);
	}

}
