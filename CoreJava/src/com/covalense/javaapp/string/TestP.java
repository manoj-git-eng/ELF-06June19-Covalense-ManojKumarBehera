package com.covalense.javaapp.string;

import lombok.extern.java.Log;

@Log
public class TestP {
	public static void main(String[] args) {
		Person p = new Person("Man", 24, 23000.77);
		p.getAge();
		p.getName();
		p.getSal();
		log.info("" + p.getName());
		log.info("" + p.getAge());
		log.info("" + p.getSal());
	}
}
