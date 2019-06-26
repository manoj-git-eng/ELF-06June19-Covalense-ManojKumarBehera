package com.covalense.javaapp.implementinglamda;

import lombok.extern.java.Log;

@Log
public class GenderMain {
public static void main(String[] args) {
	Gender t=Gender.FEMALE;
	switch(t) {
	case MALE:log.info("male");
	break;
	
	case FEMALE:log.info("female");
	break;
	
	case OTHER:log.info("others");
	break;
	
	}
}
}
