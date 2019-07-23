package com.covalense.EmpIntegration.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "newemp_info")
public class NewEmpInfoBean implements Serializable {
	@Id
	@Column(name = "Id")
	private int id;
	@Column(name = "Name")
	private String name;
	@Column(name = "Age")
	private int age;
	@Column(name = "Gender")
	private String gender;
	@Column(name = "Designation")
	private String designation;
}
