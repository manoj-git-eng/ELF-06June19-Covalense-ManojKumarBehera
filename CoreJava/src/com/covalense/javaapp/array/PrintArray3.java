package com.covalense.javaapp.array;

import lombok.extern.java.Log;

@Log
public class PrintArray3 {
	public static void main(String[] args) {

		String[] s = new String[4];
		s[0] = "MANOJ";
		s[1] = "FDGHDG";
		s[2] = "dfuih";
		s[3] = "dfiuh";
		for (int i = 0; i < s.length; i++) {
			log.info("element " + s[i]);
		}
		log.info("length " + s.length);

	}

}
