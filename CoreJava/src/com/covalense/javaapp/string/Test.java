package com.covalense.javaapp.string;

import lombok.extern.java.Log;

@Log
public class Test {
	public static void main(String[] args) {
		String n = "Dimple";
		int length = n.length();
		log.info("Size is " + length);
		String s = "AAAAAAAA BBBBBBBB";
		log.info(s);

	}
}
