package com.covalense.javaapp.assignmentsfive;


import lombok.extern.java.Log;

/*
 * WAP to addd num using lamda expression 
 */
@Log
public class Pro1 {

	static Pro1int s = (a, b) -> a + b;

	public static void main(String[] args) {
		int i = s.add(5, 10);
		log.info("addtion= " + i);

	}

}
