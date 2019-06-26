package com.covalense.javaapp.implementinglamda;

import lombok.extern.java.Log;

@Log
public class TestSwitch {
	public static void main(String[] args) {
		String s = "cat";
		switch (s) {

		case "apple":
			log.info("i am apple");
			break;

		case "cat":
			log.info("i am cat");
			break;

		default:
			log.info("String is wrong");
			break;

		}
	}
}
