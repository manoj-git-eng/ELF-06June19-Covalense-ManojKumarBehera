package com.covalense.javaapp.basics;

import lombok.extern.java.Log;

@Log
public class Pro16 {
	public static void main(String[] args) {
		double perc = 47.68;
		if (perc >= 70) {
			log.info("A grade");
		} else if (perc >= 50) {
			log.info("B grade");
		} else if (perc >= 30) {
			log.info("C grade");
			log.info("C grade");
		}

		else {
			log.info("FAIL");
		}
	}
}
