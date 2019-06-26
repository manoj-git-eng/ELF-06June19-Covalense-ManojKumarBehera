package com.covalense.javaapp.lamdaex;

import lombok.extern.java.Log;

@Log
public class TestAdd {
	public static void main(String[] args) {

		LamdaAdd s = (a, b) -> a + b;
		int i = s.add(5, 2);
		log.info("Add is " + i);
	}
}
