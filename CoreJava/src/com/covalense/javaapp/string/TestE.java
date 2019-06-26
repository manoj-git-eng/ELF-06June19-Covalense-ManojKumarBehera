package com.covalense.javaapp.string;

import lombok.extern.java.Log;

@Log
public class TestE {
	public static void main(String[] args) {

		Employee e = new Employee("Manoj", 23, 24069.87, true);
		e.getAge();
		e.getName();
		e.getSal();
		e.isStatus();
		log.info("" + e.getName());
		log.info("" + e.getSal());
		log.info("" + e.isStatus());

	}
}
