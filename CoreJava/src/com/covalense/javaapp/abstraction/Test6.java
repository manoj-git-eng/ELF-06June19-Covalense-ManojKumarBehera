package com.covalense.javaapp.abstraction;

public class Test6 {
	public static void main(String[] args) {
		Browser b = new Browser();
		Gmail g = new Gmail();
		Gdrive d = new Gdrive();
		b.open(g);
		b.open(d);

	}
}
