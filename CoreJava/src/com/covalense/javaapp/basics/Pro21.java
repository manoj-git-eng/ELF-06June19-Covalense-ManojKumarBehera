package com.covalense.javaapp.basics;

import lombok.extern.java.Log;

@Log
public class Pro21 {

	static double calculateBmi(double wgt, double hgt) {
		return (wgt) / (hgt * hgt);

	}

	public static void main(String[] args) {
		double d = calculateBmi(72.5, 1.6);
		log.info("Your BMI is " + d);
		dec(d);
	}

	private static void dec(double d) {
		if (d >= 30) {
			log.info("OBESE");
		} else if (d >= 18.5 && d <= 24.9) {
			log.info("HEALTHY");
		} else if (d >= 25.0 && d <= 29.9) {
			log.info("OVER WEIGHT");
		} else if (d < 18.5) {
			log.info("UNDER WEIGHT");
		}
	}

}
