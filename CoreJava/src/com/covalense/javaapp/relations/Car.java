package com.covalense.javaapp.relations;

import lombok.extern.java.Log;

@Log
public class Car {
	MusicS m = new MusicS();

	void play() {
		log.info("Playing music");
	}

}
