package com.covalense.javaapp.assignments03;

public class Gun {
	void count(BeforeShoot b) {
		if (b instanceof Round1) {
			b.bullets();
		} else if (b instanceof Round2) {
			b.bullets();
		} else if (b instanceof Round3) {
			b.bullets();
		}
	}
}
