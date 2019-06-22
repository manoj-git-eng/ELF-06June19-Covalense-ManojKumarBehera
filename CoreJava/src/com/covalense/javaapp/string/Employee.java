package com.covalense.javaapp.string;

final class Employee 
{
	private final String name;
	private final int age;
	private final double sal;
	private final boolean status;
	public Employee(String name, int age, double sal, boolean status) {
		super();
		this.name = name;
		this.age = age;
		this.sal = sal;
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getSal() {
		return sal;
	}
	public boolean isStatus() {
		return status;
	}
	
}
