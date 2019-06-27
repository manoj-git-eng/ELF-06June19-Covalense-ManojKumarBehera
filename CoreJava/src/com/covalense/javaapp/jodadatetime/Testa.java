package com.covalense.javaapp.jodadatetime;


import java.time.ZoneId;

import lombok.extern.java.Log;

@Log
public class Testa {
	public static void main(String[] args) {

		/*
		 * LocalDate l1=LocalDate.now(); LocalDate l2=LocalDate.of(1995, 04, 17); Period
		 * p=Period.between(l2, l1); int r=p.getYears(); log.info(""+p);
		 */
		
		ZoneId z=ZoneId.of("Asia/Kolkata");
		
		log.info(""+z);
	}

}
