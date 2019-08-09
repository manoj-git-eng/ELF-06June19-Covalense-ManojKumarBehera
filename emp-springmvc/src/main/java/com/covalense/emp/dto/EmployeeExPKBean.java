package com.covalense.emp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.ToString;

@SuppressWarnings("serial")
@Data
@Embeddable
@ToString
public class EmployeeExPKBean implements Serializable {

	@ManyToOne
	@JoinColumn(name = "Id")
	private EmployeeInfoBean infoBean;
	@Column(name = "CompanyName")
	private String companyName;

}
