package com.covalense.javaapp.assignmentsss;

import lombok.Data;

@Data
public class Student1 {

	String name;
	int age;
	public Student1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
