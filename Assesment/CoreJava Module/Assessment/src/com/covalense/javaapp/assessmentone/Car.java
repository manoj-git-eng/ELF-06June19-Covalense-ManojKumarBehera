package com.covalense.javaapp.assessmentone;

import java.util.ArrayList;
import java.util.logging.Logger;

/*WAP to display only the cars that belongs to respective brand. (Using Lambda and Stream)*/

public class Car {

	public static void main(String[] args) {
		final Logger log = Logger.getLogger("man");
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("Audi");
		a1.add("Honda");
		a1.add("Benz");

		a1.stream().forEach(i -> log.info("" + a1));

	}

}
