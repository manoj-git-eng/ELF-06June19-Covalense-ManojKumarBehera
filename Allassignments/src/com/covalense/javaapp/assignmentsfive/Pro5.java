package com.covalense.javaapp.assignmentsfive;

import java.util.logging.Logger;

import lombok.extern.java.Log;

/*
 * WAP to print number of given range using lambda fun
 */
@Log
public class Pro5 {

	public static void main(String[] args) {
		Pro5Int f = num -> {
			for (int i = 0; i <= num; i++)
				log.info("" + i);
		};
		f.rang(5);

	}
}