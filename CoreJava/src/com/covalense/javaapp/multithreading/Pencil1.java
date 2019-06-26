package com.covalense.javaapp.multithreading;

import java.util.concurrent.Callable;

public class Pencil1 implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		return 120;
	}

}
