package com.covalense.javaapp.encapsulation;

public class Test2 {
	public static void main(String[] args) {

		Employee e = new Employee();
		e.setName("M");
		e.setSal(23678.56);
		e.setGen("Male");
		DBS1 d = new DBS1();
		d.recv(e);
		Employee e2 = new Employee();
		e2.setName("B");
		e2.setGen("FEMALE");
		e2.setSal(67987.78);
		d.recv(e2);

	}
}
