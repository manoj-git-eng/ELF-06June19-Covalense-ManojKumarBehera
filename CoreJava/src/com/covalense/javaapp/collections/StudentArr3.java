package com.covalense.javaapp.collections;

public class StudentArr3 implements Comparable<StudentArr3> {
	String name;
	int age;
	double percentage;
	int id;

	@Override
	public int compareTo(StudentArr3 o) {
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
