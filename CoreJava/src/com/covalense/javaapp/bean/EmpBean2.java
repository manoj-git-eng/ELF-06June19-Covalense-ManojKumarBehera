package com.covalense.javaapp.bean;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpBean2 implements Serializable {
	private int id;
	private String name;
	private String dept;
	private double salary;
	private int age;
	private Date joindate;
	private String gender;
}
