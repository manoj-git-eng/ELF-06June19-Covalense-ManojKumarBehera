package com.covalense.emp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@SuppressWarnings("serial")
@Data
@Entity
@ToString
@Table(name = "employees_others_info")
public class EmployeeOtherInfoBean implements Serializable {
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

}
