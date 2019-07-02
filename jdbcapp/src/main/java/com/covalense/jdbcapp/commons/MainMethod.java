package com.covalense.jdbcapp.commons;

public class MainMethod {
	public static void main(String[] args) {
		/*
		 * ClassA classB = new ClassA(); ref.printMessege();
		 */
		Connection con=MyClass.getConnection(args[0]);
		con.printMessege();
	}
}
