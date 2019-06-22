package com.covalense.javaapp.array;

import lombok.extern.java.Log;

@Log
public class PrintArray4 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < a.length; i++) {
			log.info("element " + a[i]);
		}

	}
}
