package com.covalense.emp.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@SuppressWarnings("serial")
@Entity
@Data
@Table(name = "education_details")
@ToString
public class EducationDetailsInfoBean implements Serializable {
	
	@EmbeddedId
	private EducationDetailsPKBean educationDetailsPKBean;

	@Column(name = "College")
	private String college;
	@Column(name = "Branch")
	private String branch;
	@Column(name = "Passout")
	private Date passout;

}
