package com.covalense.erest.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;


@SuppressWarnings("serial")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "education_details")
public class EducationDetailsInfoBean implements Serializable {
	
	@EmbeddedId
	private EducationDetailsPKBean educationDetailsPKBean;

	@Column(name = "College")
	private String college;
	@Column(name = "Branch")
	private String branch;
	@Column(name = "Passout")
	private Date passout;
	public EducationDetailsPKBean getEducationDetailsPKBean() {
		return educationDetailsPKBean;
	}
	public void setEducationDetailsPKBean(EducationDetailsPKBean educationDetailsPKBean) {
		this.educationDetailsPKBean = educationDetailsPKBean;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Date getPassout() {
		return passout;
	}
	public void setPassout(Date passout) {
		this.passout = passout;
	}
	
	

}
