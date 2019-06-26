package com.covalense.javaapp.assignmentsthree;

public class Driver {
	void recieve(Car c) {
		if (c instanceof Audi) {
			c.recieve();
		} else if (c instanceof Benz) {
			c.recieve();
		}
	}
}
