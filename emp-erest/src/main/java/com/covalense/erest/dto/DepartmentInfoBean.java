package com.covalense.erest.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;


@SuppressWarnings("serial")
//@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "dept_info")
public class DepartmentInfoBean implements Serializable {
	
	//@XmlTransient
	@JsonIgnore
	private EmployeeInfoBean infoBean;
	@Id
	@Column(name = "Dept_Id")
	private Integer deptId;
	@Column(name = "Dept_name")
	private String deptName;
	public EmployeeInfoBean getInfoBean() {
		return infoBean;
	}
	public void setInfoBean(EmployeeInfoBean infoBean) {
		this.infoBean = infoBean;
	}
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	

}
