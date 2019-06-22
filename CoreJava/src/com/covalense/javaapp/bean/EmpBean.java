package com.covalense.javaapp.bean;

import java.io.Serializable;
import java.util.Date;

public class EmpBean implements Serializable {
	private int id;
	private String name;
	private String dept;
	private double salary;
	private int age;
	private Date joindate;
	private String gender;
	
	
	

	public EmpBean(int id, String name, String dept, 
			double salary, int age, Date joindate, String gender) {
		
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.age = age;
		this.joindate = joindate;
		this.gender = gender;
	}

	public EmpBean() {
		
		
		
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getJoindate() {
		return joindate;
	}

	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "EmpBean [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + ", age=" + age
				+ ", joindate=" + joindate + ", gender=" + gender + "]";
	}

}
