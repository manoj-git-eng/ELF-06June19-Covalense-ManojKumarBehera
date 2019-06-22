package com.covalense.javaapp.bean;

import java.util.logging.Logger;

public class TestEmp {
	public static final Logger log = Logger.getLogger("TestEmp");

	public static void main(String[] args) {

		EmpBean2 e1 = new EmpBean2();
		log.info(e1.toString());

		EmpBean2 e2 = new EmpBean2();
		log.info("Withlombok" + e2.toString());

	}
}
