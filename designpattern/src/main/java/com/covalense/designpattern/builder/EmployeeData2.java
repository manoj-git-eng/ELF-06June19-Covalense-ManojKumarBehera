package com.covalense.designpattern.builder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class EmployeeData2 {
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

	private EmployeeData2(EmployeeData2Builder builder) {
		id = builder.id;
		name = builder.name;
		age = builder.age;
		gender = builder.gender;
		salary = builder.salary;
		phnum = builder.phnum;
		joiningDate = builder.joiningDate;
		accountNumber = builder.accountNumber;
		email = builder.email;
		designation = builder.designation;
		dateOfBirth = builder.dateOfBirth;
		departmentId = builder.departmentId;
		managerId = builder.managerId;

	}

	public static class EmployeeData2Builder {

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

		public EmployeeData2Builder id(int id) {
			this.id = id;
			return this;
		}

		public EmployeeData2Builder name(String name) {
			this.name = name;
			return this;
		}

		public EmployeeData2Builder age(int age) {
			this.age = age;
			return this;
		}

		public EmployeeData2Builder gender(String gender) {
			this.gender = gender;
			return this;
		}

		public EmployeeData2Builder salary(double salary) {
			this.salary = salary;
			return this;
		}

		public EmployeeData2Builder phnum(long phnum) {
			this.phnum = phnum;
			return this;
		}

		public EmployeeData2Builder joiningDate(String joiningDate) {
			this.joiningDate = joiningDate;
			return this;
		}

		public EmployeeData2Builder accountNumber(long accountNumber) {
			this.accountNumber = accountNumber;
			return this;
		}

		public EmployeeData2Builder email(String email) {
			this.email = email;
			return this;
		}

		public EmployeeData2Builder designation(String designation) {
			this.designation = designation;
			return this;
		}

		public EmployeeData2Builder dateOfBirth(String dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
			return this;
		}

		public EmployeeData2Builder departmentId(int departmentId) {
			this.departmentId = departmentId;
			return this;
		}

		public EmployeeData2Builder managerId(int managerId) {
			this.departmentId = managerId;
			return this;
		}

		public EmployeeData2 build() {
			return null;
		}

	}

}
