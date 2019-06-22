package com.covalense.javaapp.array;

import lombok.extern.java.Log;

@Log
public class ArrayForeach {
	public static void main(String[] args) {
		int[] a = { 1, 4, 76, 78, 6, 4 };
		double[] b = { 12.4, 34.6, 23.5, 45.98 };
		String[] c = { "man", "gah", "jkdhao" };
		for (int x : a) {
			log.info(x + " ");
		}
		for (double d : b) {
			log.info(d + " ");
		}
		for (String s : c) {
			log.info(s + " ");
		}
	}
}
