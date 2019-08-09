package com.covalense.emp.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "employee_info")
public class EmployeeInfoBean implements Serializable {
	
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "infoBean")
	private EmployeeOtherInfoBean employeeOtherInfoBean;

	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "addressPKBean.infoBean")
	private List<EmployeeAddressInfoBean> addressInfoBean;

	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "educationDetailsPKBean.infoBean")
	private List<EducationDetailsInfoBean> educationDetailsInfoBeans;

	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "employeeExPKBean.infoBean")
	private List<EmployeeExperienceInfoBean> employeeExperienceInfoBeans;

	@LazyCollection(LazyCollectionOption.FALSE)
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "infoBeans")
	private List<TrainingInfoBean> trainingInfoBeans;

	@Id
	@Column(name = "Id")
	private Integer id;
	@Column(name = "Name")
	private String name;
	@Column(name = "Age")
	private Integer age;
	@Column(name = "Gender")
	private String gender;
	@Column(name = "Salary")
	private Double salary;
	@Column(name = "Phone")
	private Long phnum;
	@Column(name = "Joining_Date")
	private Date joiningDate;
	@Column(name = "Account_Number")
	private Long accountNumber;
	@Column(name = "Email")
	private String email;
	@Column(name = "Designation")
	private String designation;
	@Column(name = "Date_Of_Birth")
	private Date dateOfBirth;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "departmentId", referencedColumnName = "dept_Id")
	private DepartmentInfoBean departmentInfoBean;

	@Column(name = "Password")
	private String password;

	// @Column(name = "Manager_Id")
	// private String managerId;

	@ManyToOne
	@JoinColumn(name = "Manager_Id", referencedColumnName = "Id")
	private EmployeeInfoBean mngrId;

}
