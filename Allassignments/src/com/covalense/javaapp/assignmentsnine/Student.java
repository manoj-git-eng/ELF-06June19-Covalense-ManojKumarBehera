package com.covalense.javaapp.assignmentsnine;


import lombok.extern.java.Log;
@Log
public class Student {

	String name;
	int id;
	double marks;

	void set(String name, int id, double marks) {
		this.name = name;
		this.id = id;
		this.marks = marks;

	}
	
	@Override
	public String toString() {
		return "name= "+ name+" id= "+id+" marks= "+marks;
	}

	void get() {
		log.info("name= "+name+"id= "+id+"marks= "+marks);
	}

}
