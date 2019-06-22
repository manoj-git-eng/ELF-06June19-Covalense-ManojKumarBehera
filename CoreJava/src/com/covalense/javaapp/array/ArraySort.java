package com.covalense.javaapp.array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import lombok.extern.java.Log;

@Log
class ArraySort {
	void bubbleSort(int [] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	void printArray(Integer [] arr) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			log.info(arr[i] + " ");
	}

	public static void main(String [] args) {
		ArraySort ob = new ArraySort();
		Integer arr[] = { 5, 2, 1, 4, 3 };
		Arrays.sort(arr, Collections.reverseOrder());
		log.info("Sorted array");
		ob.printArray(arr);
	}
}