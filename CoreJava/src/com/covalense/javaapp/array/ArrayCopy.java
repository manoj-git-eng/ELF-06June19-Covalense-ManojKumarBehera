package com.covalense.javaapp.array;

import lombok.extern.java.Log;

@Log
public class ArrayCopy {

	public static void main(String[] args) {
		int[] arr1 = new int[] { 1, 2, 3, 4, 5 };
		int [] arr2 = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		log.info("Elements of original array: ");
		for (int i = 0; i < arr1.length; i++) {
			log.info(arr1[i] + " ");
		}

		log.info("Elements of new array: ");
		for (int i = 0; i < arr2.length; i++) {
			log.info("" + arr2[i] + " ");
		}
	}
}
