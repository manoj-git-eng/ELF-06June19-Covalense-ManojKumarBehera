package com.covalense.javaapp.basics;

import lombok.extern.java.Log;

public class Pro24 {
	public static void main(String[] args) {
		Bmi b = new Bmi();

		b.hgt = 1.7;
		b.wgt = 74;

		State s = new State();
		s.state(b.result());

	}
}

@Log
class Bmi {
	double wgt;
	double hgt;

	public double result() {
		double bmi = (wgt) / (hgt * hgt);
		log.info("BMI is " + bmi);

		return bmi;

	}
}

@Log
class State {
	void state(double bmi) {
		if (bmi >= 30) {
			log.info("OBESE");
		} else if (bmi >= 18.5 && bmi <= 24.9) {
			log.info("HEALTHY");
		} else if (bmi >= 25.0 && bmi <= 29.9) {
			log.info("OVER WEIGHT");
		} else if (bmi < 18.5) {
			log.info("UNDER WEIGHT");
		}
	}
}