package com.covalense.javaapp.basics;

import lombok.extern.java.Log;

@Log
public class Pro7 {

	public static void main(String[] args) {
		double wgt = 35.50;
		double height = 1.75;
		double res = (wgt / height * height);
		log.info("The BMI is= " + res);
	}

}
