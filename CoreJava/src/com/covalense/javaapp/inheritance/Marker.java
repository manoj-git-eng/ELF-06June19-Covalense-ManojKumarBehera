package com.covalense.javaapp.inheritance;

import lombok.extern.java.Log;

@Log
public class Marker extends Pen {
	void color() {
		log.info("Color is black");
	}
}
