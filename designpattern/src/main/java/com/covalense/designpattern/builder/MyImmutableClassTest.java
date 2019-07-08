package com.covalense.designpattern.builder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.extern.java.Log;

@Log
public class MyImmutableClassTest {
	public static void main(String[] args) throws ParseException {

		MyImmutableClass immutableClass = null;

		immutableClass = new MyImmutableClass("Soundu", 23, 7381453678l);
		log.info("Name is " + immutableClass.getName());
		log.info("Age is " + immutableClass.getAge());
		log.info("Contact " + immutableClass.getPhone());

		immutableClass = new MyImmutableClass("Bodhuku", 25, 9381453678l);
		log.info("Name is " + immutableClass.getName());
		log.info("Age is " + immutableClass.getAge());
		log.info("Contact " + immutableClass.getPhone());
		

		EmployeeData data = new EmployeeData(17, "jhmk", 56, "male", 4500.99, 45, "1997-9-4", 499, "dhgfhg", "BgtT",
				"1997-9-4", 456, 89);
		
		log.info("Emp data 1 " + data.toString());
		
		EmployeeData2 data2=new EmployeeData2.
							EmployeeData2Builder()
							.id(123)
							.name("sina")
							.gender("male")
							.email("mgdsgayg")
							.accountNumber(556488445)
							.age(56)
							.dateOfBirth("1990-9-7")
							.designation("jssskll")
							.joiningDate("2019-9-2")
							.departmentId(89)
							.managerId(67)
							.phnum(45648787)
							.salary(90000.99)
							.build();

		log.info("Emp data 2 " + data2.toString());
		
		EmployeeData3 data3=new EmployeeData3.
				EmployeeData3Builder()
				.id(124)
				.name("sina")
				.gender("male")
				.email("mgdsgayg")
				.accountNumber(556488445)
				.age(56)
				.dateOfBirth("1990-9-7")
				.designation("jssskll")
				.joiningDate("2019-9-2")
				.departmentId(89)
				.managerId(67)
				.phnum(45648787)
				.salary(90000.99)
				.build();

log.info("Emp data 3 " + data3.toString());

	}
}
