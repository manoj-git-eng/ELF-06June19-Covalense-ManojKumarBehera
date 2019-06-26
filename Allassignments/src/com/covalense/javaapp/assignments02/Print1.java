package com.covalense.javaapp.assignments02;

/*Check prime or not*/
import lombok.extern.java.Log;

@Log
public class Print1 {
	public static void main(String[] args) {
		prime(25);
	}

	private static void prime(int a) {
		if (a != 1) {
			for (int i = 2; i <= a / 2; i++) {
				if (a % i == 0) {
					log.info("NOT PRIME");

				}

			}
			if (a % 2 == 0) {
				log.info("PRIME");
			}

		} else if (a == 1) {
			log.info("NOT PRIME");
		}
	}
}
