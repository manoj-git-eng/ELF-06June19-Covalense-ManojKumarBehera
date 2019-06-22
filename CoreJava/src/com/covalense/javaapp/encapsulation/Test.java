package com.covalense.javaapp.encapsulation;

public class Test 
{
public static void main(String[] args) 
{
	Person p=new Person();
	
	p.setName("MANOJ");
	p.setAge(24);
	p.setGender("MALE");
	DB1 d1=new DB1();
	
	d1.recieve(p);
	DB2 d2=new DB2();
	d2.recieve(p);
	
	Person p2=new Person();
	p2.setName("MMMM");
	p2.setAge(23);
	p2.setGender("MALE");
	d1.recieve(p2);

	
	
}
}
