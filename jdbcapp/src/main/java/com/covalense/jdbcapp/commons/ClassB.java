package com.covalense.jdbcapp.commons;

import lombok.extern.java.Log;

@Log
public class ClassB implements  Connection {

	@Override
	public void printMessege() {
		log.info("printing b");
	}
}
