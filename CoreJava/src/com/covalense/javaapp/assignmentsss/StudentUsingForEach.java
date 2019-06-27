package com.covalense.javaapp.assignmentsss;

import java.util.ArrayList;

import lombok.extern.java.Log;
@Log
public class StudentUsingForEach {
	public static void main(String[] args) {
		Student1 s1=new Student1("hagu", 23);
		Student1 s2=new Student1("sagu", 21);
		Student1 s3=new Student1("hbbu", 23);
		
		ArrayList<Student1> a1 = new ArrayList<>();
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		
		a1.stream().forEach(i->log.info(""+i));
	}
}
