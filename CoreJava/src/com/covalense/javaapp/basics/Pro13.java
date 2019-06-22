package com.covalense.javaapp.basics;

import lombok.extern.java.Log;

@Log
public class Pro13 {

	public static void main(String[] args) {
		int price = 20;
		switch (price) {
		case 10:
			log.info("LAYS");
			break;

		case 20:
			log.info("KURKURE");

			break;

		case 50:
			log.info("DAIRY MILK");
			break;

		default:
			log.info("INVALID");
			break;

		}
	}

}
