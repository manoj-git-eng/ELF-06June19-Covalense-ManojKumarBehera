package com.covalense.javaapp.collections;

import lombok.extern.java.Log;

@Log
public class ArrCopy {

	public static void main(String[] args) {
		int[] a = { 5, 6, 2, 1, 4 };

		int[] b = { 30, 40, 50, 60, 80 };

		System.arraycopy(a, 0, b, 1, 4);

		for (int i = 0; i < b.length; i++) {
			log.info(""+b[i]);
		}
	}

}
