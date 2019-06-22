package com.covalense.javaapp.lamdaex;

public class TestAdd {
public static void main(String[] args) {
	
	LamdaAdd s=(a,b)->a+b;
	int i=s.add(5,2);
	System.out.println("Add is "+i);
}
}
