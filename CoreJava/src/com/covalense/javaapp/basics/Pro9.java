package com.covalense.javaapp.basics;

import lombok.extern.java.Log;

@Log
public class Pro9 {

	public static void main(String[] args) {
		Double tp = 5000.0;
		int visit = 1;
		double dis = 15;
		double fi = tp - (tp * (dis / 100));

		if (visit == 1) {
			log.info("your final price is " + fi);
		}

	}

}
