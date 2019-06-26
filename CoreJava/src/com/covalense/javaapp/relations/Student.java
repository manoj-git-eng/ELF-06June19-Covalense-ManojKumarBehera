package com.covalense.javaapp.relations;

import lombok.extern.java.Log;

@Log
public class Student {
	String name;

	void play() {
		log.info(name + " PLAYING");
	}
}
