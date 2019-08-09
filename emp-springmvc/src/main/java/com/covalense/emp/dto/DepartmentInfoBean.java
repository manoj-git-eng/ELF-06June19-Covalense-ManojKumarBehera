package com.covalense.emp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "dept_info")
public class DepartmentInfoBean implements Serializable {
	
	private EmployeeInfoBean infoBean;
	@Id
	@Column(name = "Dept_Id")
	private Integer deptId;
	@Column(name = "Dept_name")
	private String deptName;

}
