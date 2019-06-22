package com.covalense.javaapp.basics;

import lombok.extern.java.Log;

@Log
public class Pro15 {

	public static void main(String[] args) {
		int press = 3;
		switch (press) {
		case 1: {
			log.info("TELUGU");
			break;
		}
		case 2: {
			log.info("TAMIL");
			break;
		}
		case 3: {
			log.info("HINDI");
			break;
		}
		default: {
			log.info("INVALID");
			break;
		}
		}

	}

}
