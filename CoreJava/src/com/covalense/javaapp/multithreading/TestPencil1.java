package com.covalense.javaapp.multithreading;

import java.util.concurrent.FutureTask;

public class TestPencil1 {
	public static void main(String[] args) {
		Pencil1 p = new Pencil1();
		FutureTask<Integer> ft = new FutureTask<Integer>(p);
		Thread t1 = new Thread();
		t1.start();
	}
}
