package com.covalense.javaapp.basics;

import lombok.extern.java.Log;

@Log
public class Pro8 {

	public static void main(String[] args) {
		double euro = 78.58;
		double dol = 69.55;
		double res1 = 1000 / euro;
		double res2 = 1000 / dol;
		log.info("1000 Rs is " + res1 + " EURO");
		log.info("1000 Rs IS " + res2 + " DOLLAR");
	}

}
