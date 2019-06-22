package com.covalense.javaapp.methodoverloading;

public class Test1 
{
	public static void main(String[] args) {
		Train t=new Train();
		t.search("m");
		t.search("m", 89);
	}
}
