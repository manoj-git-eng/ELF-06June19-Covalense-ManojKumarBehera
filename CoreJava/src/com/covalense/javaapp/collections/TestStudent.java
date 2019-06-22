package com.covalense.javaapp.collections;

import java.util.ArrayList;

public class TestStudent {

	public static void main(String[] args) {
		ArrayList<StudentArr> ar = new ArrayList<StudentArr>();

		StudentArr s1 = new StudentArr();
		s1.name = "Man";
		s1.id = 1;
		s1.age = 42;
		s1.percentage = 26.67;

		StudentArr s2 = new StudentArr();
		s2.name = "dan";
		s2.id = 16;
		s2.age = 72;
		s2.percentage = 86.67;

		StudentArr s3 = new StudentArr();
		s3.name = "gan";
		s3.id = 14;
		s3.age = 42;
		s3.percentage = 51.67;

		StudentArr s4 = new StudentArr();
		s4.name = "jan";
		s4.id = 12;
		s4.age = 22;
		s4.percentage = 54.67;

		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		ar.add(s4);

		for (int i = 0; i < ar.size(); i++) {
			StudentArr s = ar.get(i);
			System.out.println("Name is " + s.name);
			System.out.println("Id is " + s.id);
			System.out.println("Age is " + s.age);
			System.out.println("Percentage is " + s.percentage);
		}

	}

}
