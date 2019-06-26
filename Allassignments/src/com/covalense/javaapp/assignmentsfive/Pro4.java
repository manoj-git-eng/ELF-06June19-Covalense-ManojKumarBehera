package com.covalense.javaapp.assignmentsfive;

import java.util.logging.Logger;

import lombok.extern.java.Log;

/*
 * WAP to calculate sqrt of given number 
 */
@Log
public class Pro4 {

	public static void main(String[] args) {
		Pro4Int s = (sqr) -> {
			return sqr * sqr;
		};
		int sqr = s.sqrt(5);
		log.info("" + sqr);

	}

}
