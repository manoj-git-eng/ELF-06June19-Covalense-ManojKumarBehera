package com.covalense.javaapp.basics;

import lombok.extern.java.Log;

@Log
class Student {
	int mark1;
	int mark2;
	String name;

	void total() {
		log.info("" + 600);
	}

}

@Log
public class Pro22 {
	public static void main(String[] args) {
		Student s = new Student();
		s.mark1 = 34;
		s.mark2 = 56;
		s.name = "Manoj";
		s.total();
		log.info("mark1 is " + s.mark1);
		log.info("mark2 is " + s.mark2);
		log.info("Name is " + s.name);

	}
}
