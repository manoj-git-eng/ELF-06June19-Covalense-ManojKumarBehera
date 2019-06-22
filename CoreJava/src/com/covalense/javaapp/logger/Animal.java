package com.covalense.javaapp.logger;

public class Animal {
	
void sound()
{

}
void division(int a, int b)
{
	try{
	int r=a/b;
	System.out.println(r);}
	catch(ArithmeticException e) {
		System.out.println("can not divide with zero");
	}
}
}
