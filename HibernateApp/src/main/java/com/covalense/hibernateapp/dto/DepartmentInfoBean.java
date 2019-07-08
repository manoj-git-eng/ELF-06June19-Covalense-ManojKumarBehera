package com.covalense.hibernateapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name ="dept_info")
public class DepartmentInfoBean {
@Id
	@Column(name = "Id")
	private int deptId;
	@Column(name = "Dept_name")
	private String deptName;

}
