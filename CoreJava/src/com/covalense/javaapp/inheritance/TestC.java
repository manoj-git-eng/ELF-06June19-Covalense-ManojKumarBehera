package com.covalense.javaapp.inheritance;

public class TestC {
	public static void main(String[] args) {
		Lays l = new Lays();
		Kurkure k = new Kurkure();
		Baby b = new Baby();
		b.take(k);
		b.take(l);
	}
}
