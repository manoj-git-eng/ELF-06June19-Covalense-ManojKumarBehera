package com.covalense.javaapp.bean;

import lombok.extern.java.Log;

@Log
public class Test {
	public static void main(String[] args) {
		Student s = new Student("Manoj", 12, 5.8);
		log.info("Name is " + s.getName());
		log.info("Age is " + s.getAge());
		log.info("Height is " + s.getHeight());

	}
}
