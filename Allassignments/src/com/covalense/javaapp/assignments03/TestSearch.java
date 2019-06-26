package com.covalense.javaapp.assignments03;

public class TestSearch {
	public static void main(String[] args) {
		Engine e = new Engine();

		Name n = new Name();
		Id i = new Id();
		e.find(i);
		e.find(n);

	}
}
