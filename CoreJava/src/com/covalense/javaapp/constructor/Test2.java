package com.covalense.javaapp.constructor;

import lombok.extern.java.Log;

@Log
public class Test2 {
	public static void main(String[] args) {
		Student s1 = new Student("Manoj", 24, 56.78);
		s1.display();
		log.info("**************************");
		Student s2 = new Student("kanoj", 21, 51.78);
		s2.display();

	}
}
