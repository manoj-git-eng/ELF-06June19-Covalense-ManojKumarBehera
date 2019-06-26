package com.covalense.javaapp.assignmentsfive;

import lombok.extern.java.Log;

/*
 * WAP to calculate factorial using lambda exp
 */
@Log
public class Pro2 {

	public static void main(String[] args) {
		Pro2Int f = num -> {
			int fa = 0;
			for (int i = 1; i <= num; i++)
				fa = i * i + 1;
			return fa;
		};
		int fa = f.fact(5);
		log.info("" + fa);

	}

}
