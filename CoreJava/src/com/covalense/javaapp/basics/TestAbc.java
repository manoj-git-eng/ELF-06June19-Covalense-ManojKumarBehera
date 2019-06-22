package com.covalense.javaapp.basics;

import lombok.extern.java.Log;

@Log
class Testy implements Abc {

	public void xyz() {
		log.info("lllll");
	}

}

public class TestAbc {
	public static void main(String[] args) {
		Testy t = new Testy();
		t.xyz();

	}
}
