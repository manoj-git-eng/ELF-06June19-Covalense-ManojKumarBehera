package com.covalense.javaapp.inheritance;

import lombok.extern.java.Log;

@Log
public class Marker1 extends Pen1 {
	@Override
	void write() {
		log.info("Writting using Marker");
	}
}
