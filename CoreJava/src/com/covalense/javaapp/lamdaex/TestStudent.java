package com.covalense.javaapp.lamdaex;

import java.util.function.Consumer;

import lombok.extern.java.Log;
@Log
public class TestStudent {
	public static void main(String[] args) {
		Student s1 = new Student("Manoj", 10, 23, 33);
		Consumer<Student> c = s -> {
			double avg = (s1.sub1 + s1.sub2 + s1.sub3) / 3.0;
			log.info(s1.name + " average is " + avg);
		};
		c.accept(s1);
	}
}
