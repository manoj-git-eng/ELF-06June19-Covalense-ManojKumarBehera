package com.covalense.javaapp.basics;

import lombok.extern.java.Log;

@Log
public class Pro10 {

	public static void main(String[] args) {
		int age = 70;
		int fare = 100;
		double diss = 12.60;
		double dis = fare - (fare * (diss / 100));
		if (age >= 50) {
			log.info("Discounted fare is " + dis);

		} else {
			log.info("Fare is " + fare);
		}
	}

}
