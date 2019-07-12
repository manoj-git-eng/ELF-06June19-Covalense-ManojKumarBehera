package com.covalense.javaapp.assignmentsnine;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class ProJ {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		s1.set("manoj", 18, 67);
		s2.set("sadhu", 21, 77);
		s3.set("sahana", 21, 87);
		s4.set("ayushi", 22, 34);
		ArrayList<Student> t = new ArrayList<Student>();
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);
		 t.stream().forEach(i->log.info(i+""));
	}
}
