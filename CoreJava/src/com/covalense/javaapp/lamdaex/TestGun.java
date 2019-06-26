package com.covalense.javaapp.lamdaex;

import java.util.function.Supplier;

import lombok.extern.java.Log;

@Log
public class TestGun {
	public static void main(String[] args) {
		Supplier<Gun> s = () -> new Gun(100);
		Gun g = s.get();
		log.info("" + g.bullets);
	}
}
