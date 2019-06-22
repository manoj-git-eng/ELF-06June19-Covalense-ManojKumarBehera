package com.covalense.javaapp.constructor;

import lombok.extern.java.Log;

@Log
public class Employee 
{
	String name;
	int empId;
	double salary;
	Employee(String name,int empid,double sal)
	{
		this.name=name;
		empId=empid;
		salary = sal;
	}
	void display()
	{
		log.info("Name is "+ name);
		log.info("Employee ID is "+empId);
		log.info("Salary is "+salary);
	}
}
