package com.covalense.erest.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonIgnore;


@SuppressWarnings("serial")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "employee_experience")
public class EmployeeExperienceInfoBean implements Serializable {

	@EmbeddedId
	private EmployeeExPKBean employeeExPKBean;

	@Column(name = "ExperienceYear")
	private Integer experienceYear;
	@Column(name = "Technology")
	private String technology;
	public EmployeeExPKBean getEmployeeExPKBean() {
		return employeeExPKBean;
	}
	public void setEmployeeExPKBean(EmployeeExPKBean employeeExPKBean) {
		this.employeeExPKBean = employeeExPKBean;
	}
	public Integer getExperienceYear() {
		return experienceYear;
	}
	public void setExperienceYear(Integer experienceYear) {
		this.experienceYear = experienceYear;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	
	

}
