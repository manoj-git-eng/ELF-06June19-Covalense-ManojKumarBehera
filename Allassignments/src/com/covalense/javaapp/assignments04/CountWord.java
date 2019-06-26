package com.covalense.javaapp.assignments04;

import java.util.Scanner;

import lombok.extern.java.Log;

@Log
public class CountWord {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		log.info("Enter the sentence: ");
		String sen = scan.nextLine();
		String[] w = sen.split(" ");
		for (int i = 0; i <= w.length - 1; i++) {

			System.out.print(w[i] + w[i].length() + " ");
		}

	}
}
