package com.covalense.javaapp.string;

import lombok.extern.java.Log;

@Log
public class Marker {
	private static final Marker m = new Marker();

	private Marker() {
		log.info("MARKER");
	}

	public static Marker getMarker() {
		return m;
	}
}
