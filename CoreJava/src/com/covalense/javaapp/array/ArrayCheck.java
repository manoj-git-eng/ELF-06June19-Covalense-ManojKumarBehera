package com.covalense.javaapp.array;

import lombok.extern.java.Log;

@Log
public class ArrayCheck {
	public static void main(String[] args) {
		int[] arrayOne = { 2, 5, 1, 7, 4 };

		int[] arrayTwo = { 2, 5, 1, 7, 4 };

		boolean equalOrNot = true;

		if (arrayOne.length == arrayTwo.length) {
			for (int i = 0; i < arrayOne.length; i++) {
				if (arrayOne[i] != arrayTwo[i]) {
					equalOrNot = false;
				}
			}
		} else {
			equalOrNot = false;
		}

		if (equalOrNot) {
			log.info("Two Arrays Are Equal");
		} else {
			log.info("Two Arrays Are Not equal");
		}
	}
}
