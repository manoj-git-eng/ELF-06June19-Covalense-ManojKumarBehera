package com.covalense.javaapp.assignmentsss;

import java.util.ArrayList;

import lombok.extern.java.Log;

@Log
public class EmployeesUsingForEach {
	public static void main(String[] args) {
		Employees e1 = new Employees("muhib");
		Employees e2 = new Employees("khan shab");
		Employees e3 = new Employees("minaj");

		ArrayList<Employees> a1 = new ArrayList<>();

		a1.add(e1);
		a1.add(e2);
		a1.add(e3);

		a1.stream().forEach(i -> log.info("" + i));

	}
}
