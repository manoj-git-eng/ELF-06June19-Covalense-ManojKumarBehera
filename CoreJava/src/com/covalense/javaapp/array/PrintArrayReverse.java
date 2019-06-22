package com.covalense.javaapp.array;

import lombok.extern.java.Log;

@Log
public class PrintArrayReverse {
	public static void main(String[] args) {
		int[] a = { 1, 4, 6, 9 };
		for (int i = a.length - 1; i >= 0; i--) {
			log.info("elements " + a[i]);
		}

	}
}
