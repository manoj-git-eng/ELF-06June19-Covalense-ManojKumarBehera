package com.covalense.emp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@SuppressWarnings("serial")
@Entity
@Data
@Table(name = "employee_experience")
@ToString
public class EmployeeExperienceInfoBean implements Serializable {

	@EmbeddedId
	private EmployeeExPKBean employeeExPKBean;

	@Column(name = "ExperienceYear")
	private Integer experienceYear;
	@Column(name = "Technology")
	private String technology;

}
