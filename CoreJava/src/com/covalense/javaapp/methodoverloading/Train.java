package com.covalense.javaapp.methodoverloading;

public class Train 
{
	void search(String s)
	{
		System.out.println("Searching by name");
		System.out.println(s);
	}
	void search(int n)
	{
		System.out.println("Searching by number");
		System.out.println(n);
	}
	void search(String s,int n)
	{
		System.out.println("Searching by name & number");
		System.out.println(s);
		System.out.println(n);
	}
}
