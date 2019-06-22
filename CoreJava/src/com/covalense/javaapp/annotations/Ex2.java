package com.covalense.javaapp.annotations;

import lombok.extern.java.Log;

@Log
class Ex extends Ex1 {
	@Override
	void animal() {
		log.info("Overriding");
	}

}

@Log
public class Ex2 {
	public static void main(String[] args) {
		Ex1 e = new Ex();
		e.animal();
		log.info("object " + e);

	}
}