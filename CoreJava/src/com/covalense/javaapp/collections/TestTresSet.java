package com.covalense.javaapp.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

public class TestTresSet {
public static void main(String[] args) {
	TreeSet<StudentArr3> tr=new TreeSet<StudentArr3>();
	StudentArr3 s1 = new StudentArr3();
	s1.name = "Man";
	s1.id = 1;
	s1.age = 42;
	s1.percentage = 26.67;

	StudentArr3 s2 = new StudentArr3();
	s2.name = "dan";
	s2.id = 16;
	s2.age = 72;
	s2.percentage = 86.67;

	StudentArr3 s3 = new StudentArr3();
	s3.name = "gan";
	s3.id = 14;
	s3.age = 42;
	s3.percentage = 51.67;

	StudentArr3 s4 = new StudentArr3();
	s4.name = "jan";
	s4.id = 12;
	s4.age = 22;
	s4.percentage = 54.67;

	tr.add(s1);
	tr.add(s2);
	tr.add(s3);
	tr.add(s4);
	
	for (StudentArr3 st : tr) {
		
		System.out.println("Name is " + st.name);
		System.out.println("Id is " + st.id);
		System.out.println("Age is " + st.age);
		System.out.println("Percentage is " + st.percentage);
	}
}
}
