package com.covalense.javaapp.assignments02;

/*Print 1 to 100 prime number*/
import lombok.extern.java.Log;

@Log
public class Print2 {
	public static void main(String[] args) {

		int i, j;

		for (i = 2; i < 100; i++)

		{
			for (j = 2; j <= i; j++) {
				if (i % j == 0) {

					break;
				}

			}
			if (i == j) {
				log.info(j + " ");
			}

		}

	}

}
