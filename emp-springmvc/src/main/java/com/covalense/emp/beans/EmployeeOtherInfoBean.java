package com.covalense.emp.beans;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@Table(name = "employee_other_info")
@ToString
public class EmployeeOtherInfoBean implements Serializable {
	
	@Id
	@Column(name = "Id")
	private int id;
	@Column(name = "Pan")
	private String pan;
	@Column(name = "Ismarried")
	private boolean ismarried;
	@Column(name = "Blood_Group")
	private String blood;
	@Column(name = "Ischallenged")
	private boolean ischallenged;
	@Column(name = "Emergency_contact_number")
	private long econact;
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
	private long passport;
	@Column(name = "Aadhar")
	private long aadhar;

	
}