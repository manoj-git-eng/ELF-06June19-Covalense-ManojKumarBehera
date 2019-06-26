package com.covalense.javaapp.relations;

import lombok.extern.java.Log;

@Log
public class College {
	static Student s = new Student();

	void teach() {
		log.info("TEACHING");
	}
}
