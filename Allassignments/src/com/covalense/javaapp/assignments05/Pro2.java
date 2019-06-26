package com.covalense.javaapp.assignments05;

import java.util.logging.Logger;

/*
 * WAP to calculate factorial using lambda exp
 */
public class Pro2 {
	private static final Logger log = Logger.getLogger("manu");

	public static void main(String[] args) {
		Pro2Int f = (num) -> {
			int fa = 0;
			for (int i = 1; i <= num; i++)
				fa = i * i + 1;
			return fa;
		};
		int fa = f.fact(5);
		log.info("" + fa);

	}

}
