package com.covalense.javaapp.array;

import java.util.Arrays;

import lombok.extern.java.Log;

@Log
public class TestEmp {
	public static void main(String[] args) {
		Employee[] emp = new Employee[4];
		Employee e1 = new Employee();
		e1.setName("Manoj");
		e1.setAge(24);
		e1.setSalary(8456.67);

		Employee e2 = new Employee();
		e2.setName("Soundarya");
		e2.setAge(23);
		e2.setSalary(23456.67);

		Employee e3 = new Employee();
		e3.setName("NagRaj");
		e3.setAge(24);
		e3.setSalary(22456.67);

		Employee e4 = new Employee();
		e4.setName("RajaShree");
		e4.setAge(27);
		e4.setSalary(62456.67);

		emp[0] = e1;
		emp[1] = e2;
		emp[2] = e3;
		emp[3] = e4;
		Arrays.sort(emp);
		for (Employee em : emp) {
			log.info("Name:- " + em.getName());
			log.info("Age:- " + em.getAge());
			log.info("Salary:- " + em.getSalary());

			log.info("***********");
		}
	}
}
