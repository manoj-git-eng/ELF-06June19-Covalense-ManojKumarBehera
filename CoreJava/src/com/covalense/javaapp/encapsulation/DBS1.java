package com.covalense.javaapp.encapsulation;

import lombok.extern.java.Log;

@Log
public class DBS1 {
	void recv(Employee e) {
		log.info("Name is " + e.getName());
		log.info("Salary is " + e.getSal());
		log.info("Gender is " + e.getGen());
		log.info("********************");
	}
}
