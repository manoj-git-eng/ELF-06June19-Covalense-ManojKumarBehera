package com.covalense.javaapp.methodoverloading;

public class Test 
{
	static Animal a;
	
	public static void main(String[] args)
	{
		a=new Cow();
		a.eat();
	}
}
