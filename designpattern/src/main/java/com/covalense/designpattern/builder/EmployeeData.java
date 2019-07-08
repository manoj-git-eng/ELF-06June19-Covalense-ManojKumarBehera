package com.covalense.designpattern.builder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class EmployeeData {
	private int id;
	private String name;
	private int age;
	private String gender;
	private double salary;
	private long phnum;
	private String joiningDate;
	private long accountNumber;
	private String email;
	private String designation;
	private String dateOfBirth;
	private int departmentId;
	private int managerId;
	

}
