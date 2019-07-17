package com.covalense.springboot.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonIgnore;


@SuppressWarnings("serial")
@XmlAccessorType(XmlAccessType.FIELD)
@Embeddable
public class EducationDetailsPKBean implements Serializable {
	
	
	//@XmlTransient
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "Id")
	private EmployeeInfoBean infoBean;
	@Column(name = "EducationType")
	private String educationType;
	public EmployeeInfoBean getInfoBean() {
		return infoBean;
	}
	public void setInfoBean(EmployeeInfoBean infoBean) {
		this.infoBean = infoBean;
	}
	public String getEducationType() {
		return educationType;
	}
	public void setEducationType(String educationType) {
		this.educationType = educationType;
	}
	
	
	

}
