package com.covalense.jdbcapp.commons;

import lombok.extern.java.Log;

@Log
public class ClassA implements Connection {

	@Override
	public void printMessege() {
		log.info("printing a");
	}
}// end of class
