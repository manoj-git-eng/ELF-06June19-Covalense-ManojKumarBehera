package com.covalense.javaapp.abstraction;

import lombok.extern.java.Log;

@Log
public class SBI implements ATMcard {

	public void valid() {
		log.info("VALIDATED by SBI");
	}

	public void getinfo() {
		log.info("SBI INFORMATIONS");
	}

}
