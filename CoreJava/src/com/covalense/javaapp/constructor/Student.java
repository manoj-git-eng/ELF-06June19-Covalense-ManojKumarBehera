package com.covalense.javaapp.constructor;

import lombok.extern.java.Log;

@Log
public class Student 
{
	String name;
	int age;
	double perc;
	Student(String s,int a,double d)
	{
		name =s;
		age=a;
		perc=d;
		
	
	}
void display()
{
	log.info("Name is "+name);
	log.info("Age is "+age);
	log.info("Percentage is "+perc);
}
}
