package com.covalense.javaapp.abstraction;

import lombok.extern.java.Log;

@Log
public class ICICI implements ATMcard {

	public void valid() {
		log.info("VALIDATED by ICICI");
	}

	public void getinfo() {
		log.info("ICICI INFORMATIONS");
	}

}
