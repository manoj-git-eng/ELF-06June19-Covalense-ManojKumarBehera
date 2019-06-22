package com.covalense.javaapp.array;

import java.util.Arrays;

import lombok.extern.java.Log;

@Log
public class ArraySearch {

	public static int linearSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String [] a) {
		int[] a1 = { 10, 20, 30, 50, 70, 90 };
		int key = Arrays.binarySearch(a1, 50);
		log.info(50 + " is found at index: " + key);
	}
}
