package com.covalense.javaapp.string;

import lombok.extern.java.Log;

@Log
public class TestMarker {
	public static void main(String[] args) {

		Marker m = Marker.getMarker();
		Marker m2 = Marker.getMarker();
		log.info("" + m);
		log.info("" + m2);
	}
}
