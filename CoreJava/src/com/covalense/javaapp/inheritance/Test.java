package com.covalense.javaapp.inheritance;

public class Test {
	public static void main(String[] args) {
		Girl g = new Girl();
		Mi m = new Mi();
		Iphone i = new Iphone();

		g.recieve(i);
		g.recieve(m);

	}
}
