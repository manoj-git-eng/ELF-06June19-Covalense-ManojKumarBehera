package com.covalense.javaapp.stream;

import java.util.ArrayList;
import java.util.Comparator;

import lombok.extern.java.Log;

@Log
public class TestStudent {

	static Student getTopper(ArrayList<Student> al) {
		Comparator<Student> c = (a, b) -> {
			if (a.getPercentage() > b.getPercentage()) {
				return 1;
			} else if (a.getPercentage() < b.getPercentage()) {
				return -1;
			} else {
				return 0;
			}

		};
		return al.stream().max(c).get();

	}

	public static void main(String[] args) {
		Student s1 = new Student("priya", 34.67);
		Student s2 = new Student("chand", 35.37);
		Student s3 = new Student("ragi", 39.17);
		Student s4 = new Student("hogi", 64.62);
		Student s5 = new Student("saru", 30.57);

		ArrayList<Student> a1 = new ArrayList<>();
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		a1.add(s4);
		a1.add(s5);

		Student s = getTopper(a1);
		log.info("Topper is " + s.getName() + " with percentage " + s.getPercentage());

	}
}
