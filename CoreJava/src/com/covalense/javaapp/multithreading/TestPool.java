package com.covalense.javaapp.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestPool {
	public static void main(String[] args) {
		Mouse m1 = new Mouse("My first");
		Mouse m2 = new Mouse("My second");
		Mouse m3 = new Mouse("My third");
		Mouse m4 = new Mouse("My fourth");
		Mouse m5 = new Mouse("My fifth");

		ExecutorService service = Executors.newFixedThreadPool(2);
		service.execute(m1);
		service.execute(m2);
		service.execute(m3);
		service.execute(m4);
		service.execute(m5);

		service.shutdown();
	}
}
