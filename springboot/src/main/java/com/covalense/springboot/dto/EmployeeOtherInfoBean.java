package com.covalense.springboot.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@SuppressWarnings("serial")
//@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "employees_others_info")
public class EmployeeOtherInfoBean implements Serializable {

	// @XmlTransient
	@JsonIgnore
	@Id
	@OneToOne
	@JoinColumn(name = "Id")
	// @PrimaryKeyJoinColumn(name="Id")
	private EmployeeInfoBean infoBean;
	@Column(name = "Pan")
	private String pan;
	@Column(name = "Ismarried")
	private Boolean ismarried;
	@Column(name = "Blood_Group")
	private String blood;
	@Column(name = "Ischallenged")
	private Boolean ischallenged;
	@Column(name = "Emergency_contact_number")
	private Long econact;
	@Column(name = "Nationality")
	private String nationality;
	@Column(name = "Religion")
	private String religion;
	@Column(name = "Father_name")
	private String fname;
	@Column(name = "Mother_name")
	private String mname;
	@Column(name = "Spouse_name")
	private String sname;
	@Column(name = "Passport")
	private Long passport;
	@Column(name = "Aadhar")
	private Long aadhar;

	public EmployeeInfoBean getInfoBean() {
		return infoBean;
	}

	public void setInfoBean(EmployeeInfoBean infoBean) {
		this.infoBean = infoBean;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public Boolean getIsmarried() {
		return ismarried;
	}

	public void setIsmarried(Boolean ismarried) {
		this.ismarried = ismarried;
	}

	public String getBlood() {
		return blood;
	}

	public void setBlood(String blood) {
		this.blood = blood;
	}

	public Boolean getIschallenged() {
		return ischallenged;
	}

	public void setIschallenged(Boolean ischallenged) {
		this.ischallenged = ischallenged;
	}

	public Long getEconact() {
		return econact;
	}

	public void setEconact(Long econact) {
		this.econact = econact;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Long getPassport() {
		return passport;
	}

	public void setPassport(Long passport) {
		this.passport = passport;
	}

	public Long getAadhar() {
		return aadhar;
	}

	public void setAadhar(Long aadhar) {
		this.aadhar = aadhar;
	}

}
