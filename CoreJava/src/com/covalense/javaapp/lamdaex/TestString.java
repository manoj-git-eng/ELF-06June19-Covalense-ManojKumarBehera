package com.covalense.javaapp.lamdaex;

import lombok.extern.java.Log;

@Log
public class TestString {
	public static void main(String[] args) {
		StringLength d = s -> {
			return s.length();

		};
		int r=d.length("man");
		log.info("length"+r);
	}
}
