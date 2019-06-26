package com.covalense.javaapp.assignments04;

import java.util.Scanner;

import lombok.extern.java.Log;

@Log
public class ReverseString {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		log.info("Enter the string to be reversed: ");
		String name = scan.nextLine();

		log.info("Name you entered is: " + name);

		char[] ch = name.toCharArray();

		log.info("Reverse of Name you entered is: ");

		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
	}
}
