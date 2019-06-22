package com.covalense.javaapp.inheritance;

import lombok.extern.java.Log;

@Log
public class Son extends Father {
	@Override
	void bike() {
		log.info("Modified bike");
	}
}
