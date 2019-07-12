package com.covalense.javaapp.assignmentsnine;

import lombok.extern.java.Log;

@Log
public class StudentPro {
	String name;
	int id;
	int marks;
	String gender;
	
	void set(String name, int id, int marks, String gender) {
		this.name = name;
		this.id = id;
		this.marks = marks;
		this.gender=gender;

	}
	
	@Override
	public String toString() {
		return "name= "+ name+" id= "+id+" marks= "+marks+"gender= "+gender;
	}

	void get() {
		log.info("name= "+name+"id= "+id+"marks= "+marks+"gender= "+gender);
	}

	

}
