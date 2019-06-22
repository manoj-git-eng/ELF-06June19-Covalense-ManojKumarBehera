package com.covalense.javaapp.collections;

import java.util.TreeSet;

import lombok.extern.java.Log;

@Log
public class TreeEmp {

	public static void main(String[] args) {

		EmployeeByName e9 = new EmployeeByName();
		TreeSet<Employee> t1 = new TreeSet<>(e9);

		Employee e1 = new Employee();
		e1.name = "Manu";
		e1.id = 1;
		e1.salary = 23.500;

		Employee e2 = new Employee();
		e2.name = "Sanu";
		e2.id = 2;
		e2.salary = 35.500;

		Employee e3 = new Employee();
		e3.name = "Hanu";
		e3.id = 3;
		e3.salary = 73.500;

		Employee e4 = new Employee();
		e4.name = "Zanu";
		e4.id = 4;
		e4.salary = 19.500;

		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);

		for (Employee emp : t1) {
			log.info("Name is " + emp.name);
			log.info("Id is " + emp.id);
			log.info("Salary is " + emp.salary);
			log.info("*****************");
		}

	}

}
