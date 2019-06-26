package com.covalense.javaapp.doublecolonoperator;

import lombok.extern.java.Log;

@Log
public class TestP {
	public static void main(String[] args) {
		MyProduct m = Product::new;
		Product p = m.getProduct("Dress", 999);
		log.info("Name is " + p.name);
		log.info("cost is " + p.cost);
	}
}
