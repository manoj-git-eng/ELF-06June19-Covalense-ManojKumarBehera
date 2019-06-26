package com.covalense.javaapp.wrapper;

import lombok.extern.java.Log;

@Log
public class W1 {

	public static void main(String[] args) {
		int a = 5;
		Integer i = new Integer(a);
		log.info("" + a);
		Integer d = new Integer(10);
		int f = d.intValue();
		log.info("" + f);
	}

}
