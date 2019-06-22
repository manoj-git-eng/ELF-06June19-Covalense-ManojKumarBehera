package com.covalense.javaapp.array;

import lombok.extern.java.Log;

@Log
public class PrintArray {
	public static void main(String[] args) {

		double[] d = new double[2];
		d[0] = 10.2;
		d[1] = 45.4;
		for (int i = 0; i < d.length; i++) {
			log.info("element " + d[i]);
		}
	}

}
