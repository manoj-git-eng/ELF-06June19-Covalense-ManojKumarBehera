package com.covalense.springboot.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@SuppressWarnings("serial")
//@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Data
@Table(name = "dept_info")
public class DepartmentInfoBean implements Serializable {

	// @XmlTransient
	@JsonIgnore
	private EmployeeInfoBean infoBean;
	@Id
	@Column(name = "Dept_Id")
	private Integer deptId;
	@Column(name = "Dept_name")
	private String deptName;

}
