package com.covalense.javaapp.assignments07;

import java.io.Serializable;

public class Emp implements Serializable {
	String name;
	int age;
	String designation;
	double salary;

	void set(String name, int age, String designation, double salary) {
		this.name = name;
		this.age = age;
		this.designation = designation;
		this.salary = salary;

	}
}
