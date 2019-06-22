package com.covalense.javaapp.abstraction;

import lombok.extern.java.Log;

@Log
public class HDFC implements ATMcard {
	public void valid() {
		log.info("VALIDATED by HDFC");

	}

	public void getinfo() {
		log.info("HDFC INFORMATIONS");

	}
}
