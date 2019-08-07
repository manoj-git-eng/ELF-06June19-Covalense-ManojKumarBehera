package com.covalense.emp.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;



@Data
@Entity
@ToString
@Table(name = "employee_info")
public class EmployeeInfoBean implements Serializable {

	@Id
	@Column(name = "Id")
	private int id;
	@Column(name = "Name")
	private String name;
	@Column(name = "Age")
	private int age;
	@Column(name = "Gender")
	private String gender;
	@Column(name = "Salary")
	private double salary;
	@Column(name = "Phone")
	private long phnum;
	@Column(name = "Joining_Date")
	private Date joiningDate;
	@Column(name = "Account_Number")
	private long accountNumber;
	@Column(name = "Email")
	private String email;
	@Column(name = "Designation")
	private String designation;
	@Column(name = "Date_Of_Birth")
	private Date dateOfBirth;
	@Column(name = "Dept_Id")
	private String departmentId;
	@Column(name = "Manager_Id")
	private String managerId;
	@Column(name = "Password")
	private String password;

}