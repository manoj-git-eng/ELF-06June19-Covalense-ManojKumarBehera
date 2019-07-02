package com.covalense.jdbcapp.commons;

public class MyClass {


	public static Connection getConnection(String str) {
		Connection ref = null;

		if (str.equals("one")) {
			ref = new ClassA();
		} else {
			ref = new ClassB();
		}
		return ref;
	}
}// end of the class
