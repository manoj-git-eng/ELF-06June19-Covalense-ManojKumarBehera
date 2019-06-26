package com.covalense.javaapp.assignmentsfour;

import lombok.extern.java.Log;

@Log
public class Db {
	void dispaly(Product[] a) {
		for (int i = 0; i <= a.length - 1; i++) {
			log.info("Name is: " + a[i].getName());
			log.info("Cost is: " + a[i].getCost());
			log.info("Brand is: " + a[i].getBrand());
			log.info("********************************");
		}
	}
}
