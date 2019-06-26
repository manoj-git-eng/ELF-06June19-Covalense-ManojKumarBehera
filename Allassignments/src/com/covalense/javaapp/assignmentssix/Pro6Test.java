package com.covalense.javaapp.assignmentssix;

import java.util.TreeSet;
import java.util.logging.Logger;

public class Pro6Test {

	private static final Logger log = Logger.getLogger("manu");

	public static void main(String[] args) {

		EmpById r = new EmpById();
		EmpBySal s = new EmpBySal();
		EmpByName n = new EmpByName();
		int key = 1;
		TreeSetPro6 p = new TreeSetPro6();

		TreeSet<Pro6Emp> t;
		switch (key) {
		case 1:
			t = new TreeSet<>(n);
			p.test(t);
			break;
		case 2:
			t = new TreeSet<>(r);
			p.test(t);

			break;
		case 3:
			t = new TreeSet<>(s);
			p.test(t);

			break;

		default:
			log.info("invalid number");
			break;
		}

	}

}
