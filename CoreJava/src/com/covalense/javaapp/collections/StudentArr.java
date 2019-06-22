package com.covalense.javaapp.collections;

public class StudentArr implements Comparable<StudentArr> {
	String name;
	int age;
	double percentage;
	int id;

	@Override
	public int compareTo(StudentArr o) {

		String a = this.name;
		return a.compareTo(o.name);
	}
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}

}
