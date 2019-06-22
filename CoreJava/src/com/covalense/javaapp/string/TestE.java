package com.covalense.javaapp.string;

public class TestE 
{
public static void main(String[] args) {
	
	Employee e=new Employee("Manoj", 23, 24069.87, true);
	e.getAge();
	e.getName();
	e.getSal();
	e.isStatus();
	System.out.println(e.getName());
	System.out.println(e.getSal());
	System.out.println(e.isStatus());
	
}
}
