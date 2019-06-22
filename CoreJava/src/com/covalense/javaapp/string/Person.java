package com.covalense.javaapp.string;

final class Person 
{
	private final String name;
	private final int age;
	private final double sal;
	public Person(String name, int age, double sal) {
		super();
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public double getSal()
	{
		return sal;
	}
}
